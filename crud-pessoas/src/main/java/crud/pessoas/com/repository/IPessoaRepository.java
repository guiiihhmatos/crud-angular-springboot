package crud.pessoas.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.pessoas.com.model.Pessoa;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Long>{

}
