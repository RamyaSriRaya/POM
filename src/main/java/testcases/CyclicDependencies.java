package testcases;

import org.testng.annotations.Test;

public class CyclicDependencies {

	/*
	@Test(dependsOnMethods= {"testcases.CyclicDependencies.dog"})
	public void cat()
	{
	System.out.println("cat is a animal");
	}
	@Test(dependsOnMethods= {"testcases.CyclicDependencies.goat"})
	public void dog()
	{
	System.out.println("dog is a animal");
	}
	@Test(dependsOnMethods= {"testcases.CyclicDependencies.rabbit"})
	public void goat()
	{
	System.out.println("goat is a animal");
	}
	@Test(dependsOnMethods= {"testcases.CyclicDependencies.cat"})
	public void rabbit()
	{
	System.out.println("rabbit is a animal");
	}
	*/
	
	@Test(dependsOnMethods= {"testcases.CyclicDependency.test4"})
	
	public void test1()
	{
		System.out.println("Test1 is executed");
	}
	@Test(dependsOnMethods= {"testcases.CyclicDependency.test4"})
	public void test2()
	{
		System.out.println("Test2 is executed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3 is executed");
	}
	@Test
	public void test4()
	{
		System.out.println("Test4 is executed");
	}
	
	
}
