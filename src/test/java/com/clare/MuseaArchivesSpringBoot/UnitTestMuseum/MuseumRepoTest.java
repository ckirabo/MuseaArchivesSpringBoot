package com.clare.MuseaArchivesSpringBoot.UnitTestMuseum;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.clare.MuseaArchivesSpringBoot.MuseaArchivesSpringBootApplication;
import com.clare.MuseaArchivesSpringBoot.Model.MuseumModel;
import com.clare.MuseaArchivesSpringBoot.Repository.MuseumRepo;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MuseaArchivesSpringBootApplication.class)
@DataJpaTest
public class MuseumRepoTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private MuseumRepo myRepo;
	
	@Test
	public void getAMuseumById() {
		MuseumModel model1 = new MuseumModel(
				
				"Test Museum",
				"address 1",
				"address 2",
				"Manchester",
				"ABC 123",
				"Test@gmail.com",
				"02020 02020",
				"Pay Fee",
				"www.doesntExist.com",
				"Historic"
				);
		
		entityManager.persist(model1);
		entityManager.flush();
		assertTrue(myRepo.findById(model1.getMuseum_ID()).isPresent());
		
	}
	
	
	
}
