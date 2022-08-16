import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pessoas } from '../Model/pessoas';

@Injectable({
  providedIn: 'root'
})
export class PessoasService {

  private apiUrl = "http://localhost:8080/api/pessoas/"

  constructor
  (
    private httpClient: HttpClient
  )
  {

  }

  onGetAllPessoas() : Observable<Pessoas[]>
  {
    return this.httpClient.get<Pessoas[]>(this.apiUrl)
  }

  onSavePessoa(pessoa: Pessoas) : Observable<any>
  {
    return this.httpClient.post<any>(this.apiUrl, pessoa)
  }

  onDeletePessoa(id : any) : Observable<any>
  {
    return this.httpClient.delete<any>(this.apiUrl + "delete/" + id)
  }
}
