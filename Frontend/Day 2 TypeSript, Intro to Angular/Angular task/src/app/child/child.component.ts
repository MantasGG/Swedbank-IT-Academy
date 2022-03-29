import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.scss']
})
export class ChildComponent implements OnInit {
  // @Input() text: string = '';

  // @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();
  constructor() { }

  ngOnInit(): void {
  }

  // handleClick(event: MouseEvent){
  //   console.log('clicked', this.text);
  //   this.onClick.emit(event);
  // }
}
