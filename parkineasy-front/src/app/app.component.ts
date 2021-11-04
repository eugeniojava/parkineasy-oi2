import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  /*
  public vaga: Vaga[] = [];

  constructor (private vagasService: VagasService) {
   }


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
  */
  title = 'parkineasy-front';

  url ="./public/images/parkicon.png"
}
