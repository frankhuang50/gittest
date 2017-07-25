package hello.sample;

import javax.ejb.EJB;
import javax.inject.Inject;



public class TestCdi {
	

	
//	@Inject
//	TestEjb te;
	
	@Inject
	TestCdiUtility tc;
public void sayHello() {
	tc.sayHelloFromUtility();
}

//Testpull
//Test

//@Inject=
//TestCdiUtility tc;
//	public void sayHelloFromUtility() {
//		//tc.sayHelloFromUtility();
//		TestCdiUtility tc2 = new TestCdiUtility();
//		tc2.sayHelloFromUtility();
// }
}

//Test Commit and Push
