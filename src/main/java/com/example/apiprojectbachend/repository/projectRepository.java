package com.example.apiprojectbachend.repository;

import com.example.apiprojectbachend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends JpaRepository<Project , Long> {
}
