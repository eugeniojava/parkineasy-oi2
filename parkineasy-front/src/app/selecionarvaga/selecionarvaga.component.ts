import { Component, OnInit } from '@angular/core';
import {VagasService} from "../vagas/vagas.services";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-selecionarvaga',
  templateUrl: './selecionarvaga.component.html',
  styleUrls: ['./selecionarvaga.component.css']
})
export class SelecionarvagaComponent implements OnInit {

  public listaVagas: Array<string>;
  public sub:any;
  public id:number;
  constructor(private vagasService: VagasService, private route: ActivatedRoute, private router: Router) {
    this.id = 0;
    this.listaVagas = [];
  }

  ngOnInit(): void {
    this.sub = this.route.params.subscribe(params => {
      this.id = +params['id'];
    });
    this.vagasService.listarVagasPorTipo(this.id).subscribe(
      params => {
        this.listaVagas = params;
      }
    );
  }

  voltar(): void {
    this.router.navigateByUrl('/home');
  }

}
