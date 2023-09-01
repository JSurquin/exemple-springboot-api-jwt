package com.truongbn.security.dao.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    // Modèle de données pour la demande d'inscription (signup)
    private String firstName;  // Champ pour le prénom de l'utilisateur
    private String lastName;   // Champ pour le nom de l'utilisateur
    private String email;      // Champ pour l'e-mail de l'utilisateur
    private String password;   // Champ pour le mot de passe de l'utilisateur
}
