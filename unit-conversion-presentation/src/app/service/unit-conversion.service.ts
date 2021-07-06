import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IunitConverter } from '../model/iunit-converter';


@Injectable({
  providedIn: 'root'
})
export class UnitConversionService {
  private baseUrl = '//localhost:8080/api/v1/';
  private url_api: string= '';
  inputData:any;
  
  
  

  constructor(private http:HttpClient) { }

  convert(data:any):Observable<any>{
      this.inputData = {unitType:data.unit.metricToImperial, unitValue:data.input};
      this.url_api = this.baseUrl+data.unit.unitName_1+data.unit.unitName_2;
      
      console.warn(this.inputData.unitValue+'  Data **** '+this.inputData.unitType);
      console.warn('data '+this.url_api);         
     return this.http.post<any>(this.url_api, this.inputData );
  }
}
