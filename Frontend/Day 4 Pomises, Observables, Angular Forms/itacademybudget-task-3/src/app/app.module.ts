import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AlertModule } from 'ngx-bootstrap/alert';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { ProgressbarModule } from 'ngx-bootstrap/progressbar';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BudgetsComponent } from './budgets/budgets.component';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { ExpensesComponent } from './expenses/expenses.component';
import { HomeComponent } from './home/home.component';
import {HttpClientModule} from "@angular/common/http";
import { ExpensesFormComponent } from './expenses/expenses-form/expenses-form.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    ExpensesComponent,
    HomeComponent,
    BudgetsComponent,
    ExpenseDetailsComponent,
    ExpensesFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AlertModule.forRoot(),
    BsDatepickerModule,
    ProgressbarModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}