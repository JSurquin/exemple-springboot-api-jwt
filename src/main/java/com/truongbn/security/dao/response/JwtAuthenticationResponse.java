package com.truongbn.security.dao.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationResponse {

    // Modèle de données pour la réponse d'authentification JWT
    private String token;  // Champ pour le jeton JWT retourné
}
