import { Component, OnInit } from '@angular/core';
import { Entry } from '../types';

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.scss']
})
export class ContainerComponent implements OnInit {
  header: string = 'Header from variable!';
  entryVariable: Entry = { id: 1, text: 'Mano pirmas irasas' };

  entries: Entry[] = [
    { id: 1, text: 'Mano pirmas irasas' },
    { id: 2, text: 'Mano kitas irasas' },
    { id: 3, text: 'Mano trecias irasas' },
    { id: 4, text: 'Mano ketvirtas irasas' },
    { id: 5, text: 'Mano penktas irasas' },
    { id: 6, text: 'Mano sestas irasas' },
    { id: 9, text: 'Mano paskutinis irasas' },
  ];

  constructor() { }

  ngOnInit(): void {
    // const body = document.querySelector('body');
    // if (body) {
    //   body.addEventListener('click', () => {
    //     console.log('body was clicked');
    //   });
    // }

  }

  handleChildClick(event: string) {
    console.log('child was clicked with text', event);
  }

  handleEntryClick(text: string) {
    console.log(text);
  }

}
