import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MoviesComponent } from './movies/movies.component';
import { TableComponent } from './Commmon/table/table.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [AppComponent, MoviesComponent, TableComponent, HomeComponent],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      { path: 'movies', component: MoviesComponent },
      { path: 'home', component: HomeComponent },
      { path: '', redirectTo: 'home', pathMatch: 'full' },
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
