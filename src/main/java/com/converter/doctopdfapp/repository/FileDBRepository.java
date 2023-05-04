package com.converter.doctopdfapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.converter.doctopdfapp.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}