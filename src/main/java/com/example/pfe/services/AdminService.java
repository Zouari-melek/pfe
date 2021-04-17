package com.example.pfe.services;

import com.example.pfe.models.Admin;
import com.example.pfe.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public List<Admin> getAdmin() {
        return (List<Admin>) adminRepository.findAll();
    }
}
