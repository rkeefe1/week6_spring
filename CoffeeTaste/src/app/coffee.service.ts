import { Injectable } from "@angular/core";
import { Coffee } from "./coffee";

import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class CoffeeService {
  url: string = "http://localhost:8080/coffee";

  coffeeList: Coffee[] = [];

  getCoffee(): Observable<Coffee[]> {
    return this.http.get<Coffee[]>(this.url);
  }

  addCoffee(coffee: Coffee) {
    this.http.post(this.url, coffee).subscribe();
  }

  constructor(private http: HttpClient) {}
}
