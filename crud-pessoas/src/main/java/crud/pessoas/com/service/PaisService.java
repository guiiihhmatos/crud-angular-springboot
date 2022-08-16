package crud.pessoas.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.pessoas.com.model.Pais;
import crud.pessoas.com.repository.IPaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private IPaisRepository PaisRepository;

	public List<Pais> findAll() {
		
		return PaisRepository.findAll();
	}

}
