package com.clare.MuseaArchivesSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clare.MuseaArchivesSpringBoot.Model.MuseumModel;
import com.clare.MuseaArchivesSpringBoot.Repository.MuseumRepo;
import com.clare.MuseaArchivesSpringBoot.ResourceNotFound.ResourceNotFound;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/Museums")
public class MuseumController {
    @Autowired
	MuseumRepo mRepo;
	
	
	@GetMapping("/Museum/{Museum_ID}")
	public MuseumModel getMuseum_id(@PathVariable (value = "Museum_ID") Long Museum_ID) {
		return mRepo.findById(Museum_ID).orElseThrow(()-> new ResourceNotFound("MuseumModel", "Museum_ID", Museum_ID) );
	}
	
	@GetMapping("/AllMuseums")
	public List<MuseumModel> getAllMuseums(){
		return mRepo.findAll();
	}
	
}