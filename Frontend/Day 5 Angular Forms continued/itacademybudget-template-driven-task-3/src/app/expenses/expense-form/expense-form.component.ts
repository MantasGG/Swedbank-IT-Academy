import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {ExpensesService} from 'src/app/services/expenses.service';
import {ExpenseModel} from './expense.model';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-expense-form',
  templateUrl: './expense-form.component.html',
  styleUrls: ['./expense-form.component.css'],
})
export class ExpenseFormComponent implements OnInit {
  expense: ExpenseModel = new ExpenseModel('', '', '');
  @Output() expenseUpdated: EventEmitter<void> = new EventEmitter();
  expenseForm: FormGroup;
  maximumNoteLength=20;

  get expenseName(){
    return this.expenseForm.get('name');
  }

  get expenseDate(){
    return this.expenseForm.get('date');
  }

  get expenseAmount(){
    return this.expenseForm.get('amount');
  }

  get expenseNote(){
    return this.expenseForm.get('note')
  }

  constructor(private expensesService: ExpensesService) {
    this.expenseForm = new FormGroup({
      name: new FormControl('',{ validators: [Validators.required, Validators.pattern('[a-zA-Z]*')]}),
      date: new FormControl('',{ validators: [Validators.required]}),
      amount: new FormControl('',{ validators: [Validators.required, Validators.maxLength(5)]}),
      note: new FormControl('',{
      })
    });
  }

  ngOnInit(): void {
  }

  addExpense() {
    const expense = this.expenseForm.getRawValue();
    this.expensesService.addExpense(expense).subscribe(() => {
      this.expenseUpdated.emit();
      this.expenseForm.reset();
    });
  }

  resetExpense() {
    this.expense = new ExpenseModel('', '', '');
  }
}
