import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { UnitConversionService } from '../service/unit-conversion.service';


@Component({
  selector: 'app-unit-convert',
  templateUrl: './unit-convert.component.html',
  styleUrls: ['./unit-convert.component.css']
})
export class UnitConvertComponent implements OnInit {
  convertForm:FormGroup;
  title = 'Conversion From TO';
  selectedItem :any = '';
  unit:any = ''; 
  input:string = '';
  output: string ='';  
  responseValue: any ='';
  

  
  unitList:any=[{metricToImperial:"CELSIUStoFAHRENHEIT",unitName_1:"celsius",unitName_2:"fahrenheit"},
                {metricToImperial:"FAHRENHEITtoCELSIUS",unitName_1:"fahrenheit",unitName_2:"celsius"},
                {metricToImperial:"KILOMETERtoMILE",unitName_1:"kilometer",unitName_2:"mile"},
                {metricToImperial:"MILEtoKILOMETER",unitName_1:"mile",unitName_2:"kilometer"},
                {metricToImperial:"KILOGRAMtoPOUND",unitName_1:"kilogram",unitName_2:"pound"},
                {metricToImperial:"POUNDtoKILOGRAM",unitName_1:"pound",unitName_2:"kilogram"},
                {metricToImperial:"GALLONtoLITER",unitName_1:"gallon",unitName_2:"liter"},
                {metricToImperial:"LITERtoGALLON",unitName_1:"liter",unitName_2:"gallon"},
                {metricToImperial:"ACREStoHECTARE",unitName_1:"acres",unitName_2:"hectare"},
                {metricToImperial:"HECTAREtoACRES",unitName_1:"hectare",unitName_2:"acres"}
  ];

  constructor(private fb:FormBuilder,private service:UnitConversionService) { 
      this.convertForm = this.fb.group({
      unit: [''],
      input:[''],
      output:[],
      selectedItem:[''],
      responseValue: ['']
      
    });     
  }

  ngOnInit(): void {      
  }

  convert(data:any){   
      this.service.convert(data).subscribe(resp =>{
        this.responseValue = resp;
      })      
  } 
  
}
