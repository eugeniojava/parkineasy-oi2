import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

import { VagaRequest } from './vaga-request';
import { VagaResponse } from './vaga-response';

@Injectable({ providedIn: 'root' })
export class VagasService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {}

  public addVaga(vagaRequest: VagaRequest): Observable<VagaResponse> {
    return this.http.post<VagaResponse>(
      `${this.apiServerUrl}/api/v1/gerencia/vagas`,
      vagaRequest
    );
  }
}
