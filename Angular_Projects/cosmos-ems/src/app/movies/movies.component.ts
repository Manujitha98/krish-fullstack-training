import { Component, OnInit } from '@angular/core';
import moviesData from './movie_data.json';

@Component({
  selector: 'em-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss'],
})
export class MoviesComponent implements OnInit {
  constructor() {}
  movies: any[] = moviesData;

  ngOnInit(): void {}
}
