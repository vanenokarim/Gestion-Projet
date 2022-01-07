package com.example.apiprojectbachend.controller;
import com.example.apiprojectbachend.exception.ResourceNotFoundException;
import com.example.apiprojectbachend.model.Project;
import com.example.apiprojectbachend.repository.projectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projets")
public class projectController {

    @Autowired
    private projectRepository projetRepository;

    @GetMapping
    public List<Project> getAllProject(){
        return projetRepository.findAll();
    }

    @PostMapping
    public Project createProjet(@RequestBody Project projet) {
        return projetRepository.save(projet);
    }

    @GetMapping("{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable long id){
        Project projet = projetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not exist with id:" + id));
        return ResponseEntity.ok(projet);
    }

    @PutMapping("{id}")
    public ResponseEntity<Project> updateProject(@PathVariable long id,@RequestBody Project projetDetails) {
        Project updateProject = projetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not exist with id: " + id));

        updateProject.setNom(projetDetails.getNom());
        updateProject.setLibelle(projetDetails.getLibelle());
        updateProject.setDescription(projetDetails.getDescription());
        //updateProject.setDatecreation(projetDetails.getDatecreation());

        projetRepository.save(updateProject);

        return ResponseEntity.ok(updateProject);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteProject(@PathVariable long id){

        Project projet = projetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not exist with id: " + id));

        projetRepository.delete(projet);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
