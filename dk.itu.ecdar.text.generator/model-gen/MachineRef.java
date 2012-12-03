

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class MachineRef extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4d6d7d9e (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@25184406 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@42e3f9e3 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: Serving
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Serving, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52f34d18 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge2 extends IOutputEdge {
   	    	 
		public Edge2() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=4;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d2683cd (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=2;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: Serving
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Serving, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 




/* Generating all locations */

   	/* 	Number: 1 
   		Name: Idle
   		Name: ecdarText::ETLocation */
   		
	class Idle extends ILocation {
		public Idle(MachineRef parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d2683cd (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d2683cd (controllable: false)
								new Edge3()
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false)
								new Edge4()
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.MachineRefIdle();
		}	
	}

   	/* 	Number: 2 
   		Name: Serving
   		Name: ecdarText::ETLocation */
   		
	class Serving extends ILocation {
		public Serving(MachineRef parent) {
			super("Serving", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52f34d18 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52f34d18 (controllable: false)
								new Edge2()
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@42e3f9e3 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@42e3f9e3 (controllable: false)
								new Edge1()
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=5;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.MachineRefServing();
		}	
	}

	
	ILocation Serving, Idle;
	
	public MachineRef() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		Serving = new Serving(this);
		Serving.setupEdges();
		
		current = Idle;
	}
}
