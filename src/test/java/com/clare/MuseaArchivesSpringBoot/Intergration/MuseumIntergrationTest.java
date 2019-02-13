package com.clare.MuseaArchivesSpringBoot.Intergration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.clare.MuseaArchivesSpringBoot.MuseaArchivesSpringBootApplication;
import com.clare.MuseaArchivesSpringBoot.Model.MuseumModel;
import com.clare.MuseaArchivesSpringBoot.Repository.MuseumRepo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MuseaArchivesSpringBootApplication.class)
@AutoConfigureMockMvc
public class MuseumIntergrationTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private MuseumRepo repo;
	
	@Before
	public void clearDB() {
		repo.deleteAll();
	}
	
	
	@Test
	public void getOneMuseum() throws Exception{
		MuseumModel newAddtion = new MuseumModel( "Intergration Museum", "Far Far Away",
				"Down Town", "Manchester", "JAS 9AS", "ab@gmail.com",
				"01213 1231", "free", "www.imagineIt.com","Science");
		
		repo.save(newAddtion);
		mvc.perform(get("/Museums/Museum/"+newAddtion.getMuseum_ID())
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.museum_ID", is(newAddtion.getMuseum_ID().intValue())));
				
		
	}
	
	
	
	@Test
	public void getAllMuseums() throws Exception{
		repo.save(new MuseumModel( "Intergration Museum", "Far Far Away",
				"Down Town", "Manchester", "JAS 9AS", "ab@gmail.com",
				"01213 1231", "free", "www.imagineIt.com","Science"));
		mvc.perform(get("/Museums/AllMuseums")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$[0].name", is("Intergration Museum")));
				
		
	}
	
	@Test
	public void createAMuseum() throws Exception{
		mvc.perform(MockMvcRequestBuilders.post("/Museums/newMusuem")
		.contentType(MediaType.APPLICATION_JSON)
		.content("{\"name\" : \"Car Museum\", \"Address_Line_1\" : \"Car Museum Street\", \"Address_Line_2\" : \"Some where\", \"City\" : \"Manchester\", \"postcode\" : \"SUSA 12\", \"Contact_Email\" : \"Car@gmail.com\", \"Contact_Number\" : \"020321 213\", \"Admission\" : \"Free\", \"Website\" : \"www.CarMuseum.com\",\"Category\" : \"historic\"}"))
		.andExpect(status().isOk())
		.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.name", is("Car Museum"))); 
	}
	
	

	
	
	
}
