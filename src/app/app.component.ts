import { PessoasService } from './services/pessoas.service';
import { PaisesService } from './services/paises.service';
import { EstadosService } from './services/estados.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Pais } from './Model/pais';
import { Pessoas } from './Model/pessoas';
import { Estado } from './Model/estado';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  pessoaForm: FormGroup
  paises: Pais[] = []
  estados: Estado[] = []
  pessoas: Pessoas[] = []

  constructor
  (
    public formBuilder: FormBuilder,
    public estadosService: EstadosService,
    public paisesService: PaisesService,
    public pessoasService: PessoasService
  )
  {
    this.pessoaForm = this.formBuilder.group({
      id: [''],
      nome : ['', Validators.required],
		  sobrenome : ['', Validators.required],
		  idade : ['', Validators.required],
		  pais : ['', Validators.required],
		  estado : ['', Validators.required]
    })

    this.paisesService.onGetAllPaises().subscribe(value => {

      this.paises = value;

    }, error =>
    {
      console.error(error)
    })

    this.pessoaForm.get('pais')?.valueChanges.subscribe(value => {

      this.estadosService.onGetAllEstadosById(value.id).subscribe(value => {

        this.estados = value
      },
      error => {
        console.error(error)
      })

    })

    this.onList()

  }

  ngOnInit(): void {

  }

  onSavePessoa()
  {
    this.pessoasService.onSavePessoa(this.pessoaForm.value).subscribe(value => {

      this.pessoas = this.pessoas.filter(pessoa => value.id !== pessoa.id)
      this.onList()
    },
    error => {
      console.error(error)
    })
  }

  onDelete(id: any)
  {
    this.pessoasService.onDeletePessoa(id).subscribe(value => {

      this.onList()
    })
  }

  onList()
  {
    this.pessoasService.onGetAllPessoas().subscribe(value => {

      this.pessoas = value
    })
  }

  onEdit(pessoa: Pessoas)
  {
    this.pessoaForm.setValue({

      id: pessoa.id,
      nome: pessoa.nome,
      sobrenome: pessoa.sobrenome,
      idade: pessoa.idade,
      pais: pessoa.pais.nome,
      estado: pessoa.estado.nome
    })
  }

}
