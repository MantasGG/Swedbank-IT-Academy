import { Injectable } from '@angular/core';
// import { expensesList } from '../shared/DATA';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Expense} from "../shared/expense";

@Injectable({
  providedIn: 'root',
})
export class ExpensesService {
  constructor(private httpClient : HttpClient) {
  }

  loadExpenses(): Observable<Expense[]> {
    return this.httpClient.get<Expense[]>('/api/expenses/');
  }

  // getExpense(id: string | null): Expense | undefined {
  //   return expensesList.find((item) => item.id === id);
  // }
}
