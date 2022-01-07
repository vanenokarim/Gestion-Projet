package com.example.apiprojectbachend;

import com.example.apiprojectbachend.model.Project;
import com.example.apiprojectbachend.repository.projectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProjectBachEndApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiProjectBachEndApplication.class, args);
    }

    @Autowired
    private projectRepository projetRepository;

    @Override
    public void run(String... args) throws Exception {

      /*  Project projet = new Project();
        projet.setNom("Projet");
        projet.setLibelle("Libelle");
        projet.setDescription("description ");
        projetRepository.save(projet);

        Project projet1 = new Project();
        projet1.setNom("Projet1");
        projet1.setLibelle("Libelle1");
        projet1.setDescription("description 1");
        projetRepository.save(projet1);*/

    }
}
