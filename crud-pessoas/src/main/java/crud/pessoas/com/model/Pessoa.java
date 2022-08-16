package crud.pessoas.com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name = "pessoas")
@Data
public class Pessoa implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String sobrenome;
	private int idade;
	
	@ManyToOne
	@JoinColumn (name = "id_pais")
	private Pais pais;

	@ManyToOne
	@JoinColumn (name = "id_estado")
	private Estado estado;
	
	

}
