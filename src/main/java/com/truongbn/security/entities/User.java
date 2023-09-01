package com.truongbn.security.entities;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User implements UserDetails {

    // Définition de l'entité utilisateur avec les détails de l'utilisateur
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;  // Prénom de l'utilisateur
    private String lastName;   // Nom de l'utilisateur
    @Column(unique = true)
    private String email;      // Adresse e-mail de l'utilisateur
    private String password;   // Mot de passe de l'utilisateur
    @Enumerated(EnumType.STRING)
    private Role role;         // Rôle de l'utilisateur

    // Méthode pour obtenir les autorisations de l'utilisateur (rôle)
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    // Méthode pour obtenir le nom d'utilisateur (dans ce cas, l'e-mail)
    @Override
    public String getUsername() {
        return email;
    }

    // Méthodes pour vérifier si le compte de l'utilisateur est expiré, verrouillé, ou les informations d'identification sont expirées
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // Méthode pour vérifier si le compte de l'utilisateur est activé
    @Override
    public boolean isEnabled() {
        return true;
    }
}
