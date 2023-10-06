import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { NewMedicineComponent } from './new-medicine/new-medicine.component';
import { MedicineDetailsComponent } from './medicine-details/medicine-details.component';

const routes: Routes = [
  { path: "", component: HomePageComponent },
  { path: "new", component: NewMedicineComponent },
  { path: "details", component: MedicineDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
