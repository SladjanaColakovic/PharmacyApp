import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { NewMedicineComponent } from './new-medicine/new-medicine.component';

const routes: Routes = [
  { path: "", component: HomePageComponent },
  { path: "new", component: NewMedicineComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
