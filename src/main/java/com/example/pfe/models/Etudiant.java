package com.example.pfe.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Etudiant")
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="telephone")
    private String telephone ;

    @Column(name="email")
    private String email  ;

    @Column(name = "active")
    private boolean active;
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin")
    private Admin admin;
}
