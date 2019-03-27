import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `<div> 
                Testing 
              </div>`,
  styles: [`
    div {
      color:red;
    }
          `]
})
export class TestComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
