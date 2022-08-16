package crud.pessoas.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.pessoas.com.model.Estado;
import crud.pessoas.com.repository.IEstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private IEstadoRepository estadoRepository;

	
	public List<Estado> findAllByCountry(long id)
	{
		List<Estado> estadosPaises = new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		
		for(int i = 0; i < estados.size(); i++)
		{
			if(estados.get(i).getPais().getId() == id)
			{
				estadosPaises.add(estados.get(i));
			}
		}
		
		return estadosPaises;
	}

}
