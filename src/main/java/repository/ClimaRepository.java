package repository;

import model.Clima;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimaRepository extends JpaRepository<Clima, Long> {}

