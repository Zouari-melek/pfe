package com.example.pfe.services;

import com.example.pfe.models.Etudiant;
import com.example.pfe.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public List<Etudiant> getEtudiant() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    public Optional<Etudiant> getByName(String name) {

        return etudiantRepository.findByName(name);
    }

    //public void deleteEtudiant(long id) {
        // etudiantRepository.deleteById(id);
       //}
}
