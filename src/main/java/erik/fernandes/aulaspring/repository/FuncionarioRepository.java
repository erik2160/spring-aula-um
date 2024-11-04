package erik.fernandes.aulaspring.repository;

import erik.fernandes.aulaspring.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
