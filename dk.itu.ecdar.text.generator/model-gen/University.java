
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3b9c7702 (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@38d75be7 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5116331d (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1f831b84 (urgent: false, universal: false, name: A)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@dab2399 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: D
				super(D, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6eaef085 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: D
				super(D, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7e9844b3 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: A
				super(A, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1823e82e (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: C
				super(C, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@618e490f (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: D
				super(D, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			  
			resetTime();
			
		}
	} 

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@338ff9a1 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge6 extends IInputEdge {
   	    	 
		public Edge6() {
			//Target: B
				super(B, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69cfbe29 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: B
				super(B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@641e6144 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge8 extends IOutputEdge {
   	    	 
		public Edge8() {
			//Target: C
				super(C, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 9
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2325f069 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge9 extends IInputEdge {
   	    	 
		public Edge9() {
			//Target: A
				super(A, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1e4d3904 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: B
				super(B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			  
			resetTime();
			
		}
	} 




/* Generating all locations */

   	/* 	Number: 1 
   		Name: A
   		Name: ecdarText::ETLocation */
   		
	class A extends ILocation {
		public A(University parent) {
			super("A", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2325f069 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2325f069 (controllable: false)
								new Edge9(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1e4d3904 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1e4d3904 (controllable: false)
								new Edge10()																								};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityA();
		}	
	}

   	/* 	Number: 2 
   		Name: B
   		Name: ecdarText::ETLocation */
   		
	class B extends ILocation {
		public B(University parent) {
			super("B", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@641e6144 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@641e6144 (controllable: false)
								new Edge8()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@338ff9a1 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@338ff9a1 (controllable: false)
								new Edge6(),																																																																											
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69cfbe29 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69cfbe29 (controllable: false)
								new Edge7()																																																															};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityB();
		}	
	}

   	/* 	Number: 3 
   		Name: C
   		Name: ecdarText::ETLocation */
   		
	class C extends ILocation {
		public C(University parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1823e82e (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1823e82e (controllable: false)
								new Edge4(),																																																																																																					
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@618e490f (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@618e490f (controllable: false)
								new Edge5()																																																																																									};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityC();
		}	
	}

   	/* 	Number: 4 
   		Name: D
   		Name: ecdarText::ETLocation */
   		
	class D extends ILocation {
		public D(University parent) {
			super("D", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7e9844b3 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7e9844b3 (controllable: false)
								new Edge3()																																																																																																																											};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@dab2399 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@dab2399 (controllable: false)
								new Edge1(),																																																																																																																																												
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6eaef085 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6eaef085 (controllable: false)
								new Edge2()																																																																																																																																};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityD();
		}	
	}

	
	ILocation D, C, B, A;
	
	public University() {
		super();
		A = new A(this);
		B = new B(this);
		C = new C(this);
		D = new D(this);
		
		current = A;
		
		A.setupEdges();
		B.setupEdges();
		C.setupEdges();
		D.setupEdges();
	}
}
