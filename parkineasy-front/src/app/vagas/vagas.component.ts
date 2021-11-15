import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

import { VagaResponse } from './vaga-response';
import { VagasService } from './vagas.services';

@Component({
  selector: 'app-root',
  templateUrl: './vagas.component.html',
  styleUrls: ['./vagas.component.css'],
})
export class VagasComponent {
  title = 'parkineasy-front';
  url = './public/images/parkicon.png';

  constructor(private vagasService: VagasService) {}

  ngOnInit() {}

  public onAddVaga(addForm: NgForm): void {
    this.vagasService.addVaga(addForm.value).subscribe({
      next: (response: VagaResponse) => {
        console.log(response);
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      },
    });
  }
}
