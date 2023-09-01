package com.truongbn.security.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {

    // Interface pour le service JWT

    // Méthode pour extraire le nom d'utilisateur à partir du jeton JWT
    String extractUserName(String token);

    // Méthode pour générer un jeton JWT à partir des détails de l'utilisateur
    String generateToken(UserDetails userDetails);

    // Méthode pour vérifier si un jeton JWT est valide pour un utilisateur donné
    boolean isTokenValid(String token, UserDetails userDetails);
}
