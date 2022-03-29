import { Component, OnInit } from '@angular/core';
import {ExpenseModel} from "../espense.model";

@Component({
  selector: 'app-expenses-form',
  templateUrl: './expenses-form.component.html',
  styleUrls: ['./expenses-form.component.css']
})
export class ExpensesFormComponent implements OnInit {
  expense: ExpenseModel = new ExpenseModel('','','');

  constructor() { }

  ngOnInit(): void {
    addExpense(){

    }
  }

}
