import { Injectable } from "@angular/core";
import { Observable, observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { Vaga } from "./vaga";
import { environment } from "src/environments/environment";

@Injectable({providedIn:'root'})
export class VagasService{
  private apiServerUrl = environment.apiBaseUrl;

  constructor (private http: HttpClient) { }

  public getVagas(): Observable<Vaga[]>{
    return this.http.get<Vaga[]>(`${this.apiServerUrl}/api/gerencia/vagas`);
  }

  public addVaga(vaga: Vaga): Observable<Vaga>{
    return this.http.post<Vaga>(`${this.apiServerUrl}/api/gerencia/vagas`,vaga);
  }

}


