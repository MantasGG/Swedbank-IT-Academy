import { Component, OnInit } from '@angular/core';
import {Payment} from "../types";

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.scss']
})
export class ContainerComponent implements OnInit {
  // header: string = 'Header from variable!';

  name: Payment = {name: 'Payment', amount: 1};

  constructor() { }

  ngOnInit(): void {
    // document.querySelector('body')?.addEventListener('click',() => {
    //   console.log('Body was clicked');
    // })
  }

  // handleChildClick(event: string){
  //   console.log('child was clicked with text', event);
  // }
}
