package com.crm.maven;

import org.testng.annotations.Test;

public class MavenCommandPractice 
{
	@Test(groups ="SmokeTest")
	public void contactCreate()
	{
		System.out.println("contact created successfully");
	}
	
	@Test(groups ="RegressionTest")
	public void contactDelete()
	{
		System.out.println("deleted contact successfully");
	}

}
/*
 * 
 * cd project path
 * them 
 * mvn compile to check compilation error
 * mvn package to create build of project
 * come to eclipse refresh the target folder we will get a .jar file as it is the build
 */