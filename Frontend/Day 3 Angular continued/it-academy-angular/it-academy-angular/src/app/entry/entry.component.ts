import {
  AfterViewInit,
  Component,
  EventEmitter,
  Input,
  OnChanges,
  OnDestroy,
  OnInit,
  Output,
  SimpleChanges
} from '@angular/core';
import { Entry } from '../types';

@Component({
  selector: 'app-entry',
  templateUrl: './entry.component.html',
  styleUrls: ['./entry.component.scss']
})
export class EntryComponent implements OnInit, OnChanges, AfterViewInit, OnDestroy {
  @Input() entry: Entry|undefined;
  @Output() onClick: EventEmitter<string> = new EventEmitter<string>();

  constructor() {
    console.log("entry constructor", this.entry);
  }

  ngOnInit(): void {
    console.log("entry ngOnInit", this.entry);
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log("entry ngOnChanges", changes);
  }

  ngAfterViewInit() {
    console.log("entry AfterView");
  }

  ngOnDestroy() {
    console.log("entry ngOnDestroy");
  }

  handleClick() {
    this.onClick.emit(this.entry?.text)
  }

}
