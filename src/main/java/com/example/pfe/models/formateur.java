package com.example.pfe.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="téléphone")
    private String Téléphone ;
    @Column(name="adresse")
    private String adresse ;
    @Column(name="adresse_email")
    private String adresse_email  ;
    @Column(name="lettre_motivation")
    private String lettre_motivation;
}
