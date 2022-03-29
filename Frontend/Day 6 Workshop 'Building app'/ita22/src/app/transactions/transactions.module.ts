import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TransactionsRoutingModule } from './transactions-routing.module';
import { TransactionsPageComponent } from './component/transactions-page/transactions-page.component';

@NgModule({
  declarations: [TransactionsPageComponent],
  imports: [CommonModule, TransactionsRoutingModule],
})
export class TransactionsModule {}
