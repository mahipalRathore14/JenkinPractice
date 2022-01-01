package com.crm.maven1;

import org.testng.annotations.Test;

public class MavenCommandPractice1 
{
	
	@Test(groups ="SmokeTest")
	public void createOrg()
	{
		System.out.println("org created successfully");
	}

	@Test(groups ="RegressionTest")
	public void deleteOrg()
	{
		System.out.println("org deleted successfully");
	}
}
