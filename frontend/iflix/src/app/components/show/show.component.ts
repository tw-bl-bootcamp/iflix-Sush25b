import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.scss']
})
export class ShowComponent implements OnInit {

  constructor() { }

  shows=[{'showId':1,'showName':'data1','showRating':3,'showComments':78},
  {'showId':2,'showName':'data1','showRating':3,'showComments':78}]

  ngOnInit() {
  }

}
