import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VagasComponent } from './vagas/vagas.component';

const routes: Routes = [
  {path: 'gerencia', component: VagasComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
