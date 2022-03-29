import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Payment} from "../types";

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.scss']
})
export class PaymentComponent implements OnInit {
  @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();


  @Input() entryVariableInput: Payment|undefined;

  amount: number = 0;
  name: string = 'Payment';

  constructor() { }

  ngOnInit(): void {
  }

  clickName(event: MouseEvent){
    console.log(`${this.name} name clicked`);
  }

  clickAmount(event: MouseEvent){
    console.log(`Amount: ${this.entryVariableInput?.amount}`);
  }
}
