package com.example.pfe.repositories;

import com.example.pfe.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends CrudRepository<Admin, Long> {
}
