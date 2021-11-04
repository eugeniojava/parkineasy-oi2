import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VagasComponent } from './vagas/vagas.component';
import {FuncionariosComponent} from "./funcionarios/funcionarios.component";

const routes: Routes = [
  {path: 'gerencia/vagas/cadastro', component: VagasComponent},
  {path: 'gerencia/usuarios/cadastro', component:FuncionariosComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
