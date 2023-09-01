package com.truongbn.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    // Interface pour le service utilisateur

    // Méthode pour obtenir le service de détails de l'utilisateur
    UserDetailsService userDetailsService();
}
