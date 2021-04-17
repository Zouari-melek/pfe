package com.example.pfe.controllers;

import com.example.pfe.models.Etudiant;
import com.example.pfe.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/admin")
@CrossOrigin("*")

public class adminController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping(value = "/etudiant/{name}")
    public ResponseEntity<?> findByName(@PathVariable String name) {
        try {

            Optional<Etudiant> etudiant = etudiantRepository.findByName(name);

            if (etudiant.isEmpty()) {
                return new ResponseEntity<Etudiant>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(etudiant, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Etudiant>(HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PutMapping("/etudiant/{id}")
    public ResponseEntity updateEtudiant(@PathVariable("id") long id, @RequestBody Etudiant etudiant) {
        Optional etudiantData = etudiantRepository.findById(id);

        if (etudiantData.isPresent()) {
            Etudiant newEtudiant = (Etudiant) etudiantData.get();
            newEtudiant.setName(etudiant.getName());
           // newEtudiant.setAdresse(etudiant.getAdresse());
            newEtudiant.setActive(etudiant.isActive());
            return new ResponseEntity<>(etudiantRepository.findByName(newEtudiant.getName()), HttpStatus.OK);
        } else {
            return new ResponseEntity<Etudiant>(HttpStatus.NOT_FOUND);
        }
    }
}
