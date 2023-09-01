package com.truongbn.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truongbn.security.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Repository pour l'entité User, utilisant Spring Data JPA

    // Méthode pour trouver un utilisateur par son adresse e-mail (car l'e-mail est unique)
    Optional<User> findByEmail(String email);
}
