package pharmacy.app.backend.model;

import jakarta.persistence.*;

@Entity
public class Dose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private String unit;
    @ManyToOne
    private Medicine medicine;

    public Long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
