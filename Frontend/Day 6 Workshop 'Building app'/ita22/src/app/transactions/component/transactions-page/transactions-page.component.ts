import { Component, OnInit } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Transaction } from '../../interfaces/transaction';
import { TransactionsService } from '../../services/transactions.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-transactions-page',
  templateUrl: './transactions-page.component.html',
  styleUrls: ['./transactions-page.component.scss'],
})
export class TransactionsPageComponent implements OnInit {
  transactionId$!: Observable<string | null>;
  transactions$!: Observable<Transaction[]>;
  constructor(private transactionsService: TransactionsService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.transactionId$ = this.route.paramMap.pipe(map((paramMap) => paramMap.get('id')));
    this.transactions$ = this.transactionsService.getTransactions();
  }
}
