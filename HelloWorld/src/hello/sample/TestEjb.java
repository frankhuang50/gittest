package hello.sample;

import javax.ejb.Stateless;
import javax.inject.Named;
@Named
@Stateless
public class TestEjb {
public void getName() {
	System.out.println("Test Ejb ...");
}
}
