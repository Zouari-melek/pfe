package com.example.pfe.controllers;

import com.example.pfe.models.Etudiant;
import com.example.pfe.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin("*")

public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService ;

    @GetMapping
    public List<Etudiant> getEtudiant() {
     return etudiantService.getEtudiant();
    }

    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

   // @PutMapping
    //public EtudiantFormulaire updateEtudiantFormulaire(@RequestBody EtudiantFormulaire etudiantFormulaire) {
     //   return etudiantFormulaireService.saveEtudiantFormulaire(etudiantFormulaire);
    //}
    //@DeleteMapping("/{id}")
   // public void deleteEtudiant(@PathVariable int id) {
      //  etudiantService.deleteEtudiant(id);
   // }
}

