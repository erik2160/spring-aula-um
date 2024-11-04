package erik.fernandes.aulaspring.repository;


import erik.fernandes.aulaspring.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
