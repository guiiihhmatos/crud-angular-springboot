import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pais } from '../Model/pais';

@Injectable({
  providedIn: 'root'
})
export class PaisesService {

  private apiUrl = "http://localhost:8080/api/pais/"

  constructor
  (
    private httpClient: HttpClient
  )
  {

  }

  onGetAllPaises() :Observable<Pais[]>
  {
    return this.httpClient.get<Pais[]>(this.apiUrl);
  }
}
