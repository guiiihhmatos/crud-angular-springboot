package crud.pessoas.com.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import crud.pessoas.com.model.Estado;

import crud.pessoas.com.service.EstadoService;

@RestController
@RequestMapping ("/api/estados/")
public class EstadoRest  {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") long idPais)
	{
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
}
