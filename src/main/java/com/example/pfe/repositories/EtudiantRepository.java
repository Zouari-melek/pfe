package com.example.pfe.repositories;

import com.example.pfe.models.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {

    Optional<Etudiant> findByName(String name);
}