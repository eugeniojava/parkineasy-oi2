import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AuthGuard } from './auth.guard';
import { LoginComponent } from './auth/login/login.component';
import { FuncionariosComponent } from './funcionarios/funcionarios.component';
import { HomeComponent } from './home/home.component';
import { VagasComponent } from './vagas/vagas.component';
import {SelecionarvagaComponent} from "./selecionarvaga/selecionarvaga.component";

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home' },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  {
    path: 'gerencia/vagas/cadastro',
    component: VagasComponent,
    canActivate: [AuthGuard],
  },
  {
    path: 'gerencia/funcionarios/cadastro',
    component: FuncionariosComponent,
    canActivate: [AuthGuard],
  },
  {
    path: 'usuario/vaga/selecionarvaga/:id',
    component: SelecionarvagaComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
