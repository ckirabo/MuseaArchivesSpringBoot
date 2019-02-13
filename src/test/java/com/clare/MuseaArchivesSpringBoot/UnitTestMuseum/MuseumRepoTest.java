package com.clare.MuseaArchivesSpringBoot.UnitTestMuseum;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.clare.MuseaArchivesSpringBoot.Repository.MuseumRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MuseumRepoTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private MuseumRepo myRepo;
	
}
