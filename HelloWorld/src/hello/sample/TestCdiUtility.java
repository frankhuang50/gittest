package hello.sample;

import javax.inject.Named;

@Named("TestCdiUtility")
public class TestCdiUtility {
	
	public void sayHelloFromUtility() {
		System.out.println("Say hi from utility class");
	}

}
