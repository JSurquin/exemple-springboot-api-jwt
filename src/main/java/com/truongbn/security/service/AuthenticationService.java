package com.truongbn.security.service;

import com.truongbn.security.dao.request.SignUpRequest;
import com.truongbn.security.dao.request.SigninRequest;
import com.truongbn.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {

    // Interface pour le service d'authentification

    // Méthode pour l'inscription d'un utilisateur
    JwtAuthenticationResponse signup(SignUpRequest request);

    // Méthode pour la connexion d'un utilisateur
    JwtAuthenticationResponse signin(SigninRequest request);
}
