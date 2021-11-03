import { Injectable } from "@angular/core";
import { Observable, observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { Funcionario } from "./funcionario";
import { environment } from "src/environments/environment";

@Injectable({providedIn:'root'})
export class FuncionariosServices{
  private apiServerUrl = environment.apiBaseUrl;

  constructor (private http: HttpClient) { }

  public addFuncionario(funcionario: Funcionario): Observable<Funcionario>{
    return this.http.post<Funcionario>(`${this.apiServerUrl}/api/gerencia/usuarios`,funcionario);
  }

}


