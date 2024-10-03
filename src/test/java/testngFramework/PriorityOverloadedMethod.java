package testngFramework;

import org.testng.annotations.Test;

public class PriorityOverloadedMethod {

	@Test()
	public void z() {

		System.out.println("-----method ZZ---");
	}

	@Test()
	public void z(int a) {

		System.out.println("-----method ZZ---");
	}

	@Test()
public void z(int a , int b) {

	System.out.println("-----method ZZ---");
}

}