import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewMedicineComponent } from './new-medicine.component';

describe('NewMedicineComponent', () => {
  let component: NewMedicineComponent;
  let fixture: ComponentFixture<NewMedicineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewMedicineComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewMedicineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
