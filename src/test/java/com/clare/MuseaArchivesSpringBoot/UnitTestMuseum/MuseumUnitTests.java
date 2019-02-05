package com.clare.MuseaArchivesSpringBoot.UnitTestMuseum;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clare.MuseaArchivesSpringBoot.Repository.MuseumRepo;

public class MuseumUnitTests {

	MuseumRepo mRepo;
	
	@Before
	public void setUp() {

	}
	
	
	
	@Test
	public void testForGettingAMuseumByID() {
		
		//assertEquals("Failed : Did not return a museum", mRepo.findById(1) , "" );
		
	}
	
	
	@After
	public void tearDown() {
		
		
	}
	
}
