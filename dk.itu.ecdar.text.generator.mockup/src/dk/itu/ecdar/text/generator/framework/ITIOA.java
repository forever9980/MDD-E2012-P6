package dk.itu.ecdar.text.generator.framework;

import java.util.Vector;

/**
 * Base class for timed I/O automata implementations.
 * 
 * The automaton holds a clock and manages transitions between locations.
 */
public abstract class ITIOA {
	
	int time;
	private ILocation current;
	private ILocation[] locations;
	
	private Vector<IInput.IInputEnum> inputs;
	
	boolean executing;
	boolean executed;

	/**
	 * Notifies the TIOA about input
	 * @param input Some action
	 */
	public abstract boolean notify(IInput.IInputEnum input);
	
	/**
	 * Sets the internal clock of 
	 * @param x The value the clock will be set to
	 */
	public void setTime(int x) {
		this.time = x;
	}
	
	/**
	 * @return The current time
	 */
	public int getTime(){
		return this.time;
	}
	
	/**
	 * Spends a time unit.
	 */
	public void spendTime(){
		this.time++;
	}
	
	/**
	 * Executes the task at the current location
	 * if it hasn't been executed before. 
	 */
	public void execute() {
		if (!executing && !executed) {
			executing = true;
			current.execute();
		}
	}
	
	/**
	 * Performs a transition on the automaton
	 * 
	 * The transition should ideally be highly optimized
	 * and take very few time. 
	 */
	public void transition() {
		
		// a transition is only possible if the task
		// at the current location has been performed
		if (!executing && executed)
			return;
		
		Vector<IInput.IInputEnum> currentInputs = (Vector<IInput.IInputEnum>) inputs.clone();
		inputs.clear();
		
		for(IInput.IInputEnum input : currentInputs) {
			for(IEdgeControllable edge : current.inputEdges) {
				if (edge.acceptInput(input) && edge.checkGuard()) {
					current = edge.traverse();
					
					// in each run the automaton can traverse at most one edge
					// TODO: talk to andrzej about this!
					return;
				}
			}
		}
		
		// no edge has been traversed
		// an output edge now is allowed to traverse
		for(IEdge edge: current.outputEdges){
			if(edge.checkGuard()) {
				current = edge.traverse();
				
				// in each run the automaton can traverse at most one edge
				// TODO: talk to andrzej about this!
				return;
			}
		}
	}
}
