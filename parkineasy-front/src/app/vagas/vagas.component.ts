import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Vaga } from './vaga'
import { VagasService } from './vagas.services';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './vagas.component.html',
  styleUrls: ['./vagas.component.css']
})

export class VagasComponent {
  public vaga: Vaga[] = [];

  constructor (private vagasService: VagasService) {
   }

   /*
  ngOnInit(){
    this.getVagas();
  }

  public getVagas() : void{
    this.vagasService.getVagas().subscribe(
      (response: Vaga []) =>{
        this.vaga = response;
      },
      (error : HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }
  */
  public onAddVaga(addForm: NgForm): void{
    this.vagasService.addVaga(addForm.value).subscribe(
      (response: Vaga) =>{
        console.log(response)
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }




  title = 'parkineasy-front';

  url ="./public/images/parkicon.png"
}
