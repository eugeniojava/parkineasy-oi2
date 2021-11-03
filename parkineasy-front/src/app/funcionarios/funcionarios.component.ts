import { Component, OnInit } from '@angular/core';
import {Funcionario} from "./funcionario";
import {FuncionariosServices} from "./funcionarios.services";
import {NgForm} from "@angular/forms";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-funcionarios',
  templateUrl: './funcionarios.component.html',
  styleUrls: ['./funcionarios.component.css']
})
export class FuncionariosComponent {
  public funcionario: Funcionario[] = [];

  constructor(private funcionariosServices: FuncionariosServices) { }

  public onAddFuncionario(addForm: NgForm): void{
    this.funcionariosServices.addFuncionario(addForm.value).subscribe(
      (response: Funcionario) =>{
        console.log(response)
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }

  title = 'parkineasy-front';
  url ="./public/images/parkicon.png"
  hide: any;
}
