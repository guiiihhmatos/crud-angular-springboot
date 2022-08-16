package crud.pessoas.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.pessoas.com.model.Estado;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Long>{

}
