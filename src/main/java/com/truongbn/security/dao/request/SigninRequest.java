package com.truongbn.security.dao.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {

    // Modèle de données pour la demande de connexion (signin)
    private String email;     // Champ pour l'e-mail de l'utilisateur
    private String password;  // Champ pour le mot de passe de l'utilisateur
}
