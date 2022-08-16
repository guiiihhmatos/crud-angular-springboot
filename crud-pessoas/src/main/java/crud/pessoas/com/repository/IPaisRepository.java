package crud.pessoas.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.pessoas.com.model.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long> {

}
