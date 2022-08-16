package crud.pessoas.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.pessoas.com.model.Pessoa;
import crud.pessoas.com.repository.IPessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private IPessoaRepository PessoaRepository;

	public List<Pessoa> findAll() {
		
		return PessoaRepository.findAll();
	}


	public <S extends Pessoa> S save(S entity) {
		return PessoaRepository.save(entity);
	}

	public void deleteById(Long id) {
		PessoaRepository.deleteById(id);
		
	}

	public void delete(Pessoa entity) {
		PessoaRepository.delete(entity);
		
	}
	
	public Optional<Pessoa> findById(long id)
	{
		return PessoaRepository.findById(id);
	}

}
