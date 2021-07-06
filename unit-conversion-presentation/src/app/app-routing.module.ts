import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UnitConvertComponent } from './unit-convert/unit-convert.component';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
