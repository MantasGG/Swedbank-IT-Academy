import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Transaction } from '../interfaces/transaction';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class TransactionsService {
  constructor(private httpClient: HttpClient) {}

  getTransactions(): Observable<Transaction[]> {
    return this.httpClient.get<Transaction[]>('/api/transactions');
  }
}
