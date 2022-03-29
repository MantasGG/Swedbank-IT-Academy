import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TransactionsPageComponent } from './component/transactions-page/transactions-page.component';

const routes: Routes = [
  { path: '', component: TransactionsPageComponent },
  { path: ':id', component: TransactionsPageComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TransactionsRoutingModule {}
