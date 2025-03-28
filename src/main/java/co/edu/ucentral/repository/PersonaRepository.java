package co.edu.ucentral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}