import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'em-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss'],
})
export class TableComponent implements OnInit {
  constructor() {
    this.tableData = [];
    this.filteredData = this.tableData;
  }
  @Input() tableData: any[];

  filteredData: any[];
  toggleIndex: boolean = true;
  private _tableFilter: string = '';

  set tableFilter(value: string) {
    this._tableFilter = value;
    this.filterTable();
  }
  get tableFilter(): string {
    return this._tableFilter;
  }

  filterTable(): void {
    this.filteredData = this.tableData.filter((item) => {
      return item.name.toLowerCase().includes(this._tableFilter.toLowerCase());
    });
  }

  toggleIndexFunction(): void {
    this.toggleIndex = !this.toggleIndex;
  }

  ngOnInit(): void {
    this.filteredData = this.tableData;
  }
}
