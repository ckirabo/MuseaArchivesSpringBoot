package com.clare.MuseaArchivesSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clare.MuseaArchivesSpringBoot.Model.MuseumModel;

@Repository
public interface MuseumRepo extends JpaRepository<MuseumModel, Long> {

	
}
