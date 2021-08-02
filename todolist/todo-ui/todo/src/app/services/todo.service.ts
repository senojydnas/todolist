import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Todo} from '../models/todo.model';
import {environment} from '../../environments/environment';


@Injectable({
  providedIn: 'root'
})
export class TodoService {
  private baseURL = `${environment.api}/api/todo`

  constructor(private http: HttpClient) {
  }


  getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.baseURL)
  }
}
