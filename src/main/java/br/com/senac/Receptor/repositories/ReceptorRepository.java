package br.com.senac.Receptor.repositories;

import br.com.senac.Receptor.entities.Receptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptorRepository extends JpaRepository<Receptor, Integer> {
}
