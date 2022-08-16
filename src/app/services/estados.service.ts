import { Estado } from './../Model/estado';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EstadosService {

  private apiUrl = "http://localhost:8080/api/estados/"

  constructor
  (
    private httpClient: HttpClient
  )
  {

  }

  onGetAllEstadosById(idPais: any) :Observable<Estado[]>
  {
    return this.httpClient.get<Estado[]>(this.apiUrl + idPais)
  }
}
