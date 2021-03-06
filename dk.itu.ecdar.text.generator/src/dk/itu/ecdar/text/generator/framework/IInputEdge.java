package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for controllable edge implementations.
 * 
 *  A controllable edge is defined as an edge being controlled
 *  by input.
 */
public abstract class IInputEdge extends IEdge {

	public IInputEdge(ILocation to, String signal) {
		super(to, signal);
	}

	@Override
	public boolean acceptInput(String input) {
		return input.equals(signal);
	}

}
