package pharmacy.app.backend.model;

import jakarta.persistence.*;
import pharmacy.app.backend.enumeration.Form;

import java.util.Set;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nonProprietaryName;
    private String genericName;
    private Form form;
    private int maxDose;
    private String therapeuticIndications;
    private String dosing;
    private String interactions;
    private String contraindications;
    private String mechanismOfAction;
    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY)
    private Set<Dose> doses;

    public Long getId() {
        return id;
    }

    public String getNonProprietaryName() {
        return nonProprietaryName;
    }

    public String getGenericName() {
        return genericName;
    }

    public Form getForm() {
        return form;
    }

    public int getMaxDose() {
        return maxDose;
    }

    public String getTherapeuticIndications() {
        return therapeuticIndications;
    }

    public String getDosing() {
        return dosing;
    }

    public String getInteractions() {
        return interactions;
    }

    public String getContraindications() {
        return contraindications;
    }

    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    public Set<Dose> getDoses() {
        return doses;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNonProprietaryName(String nonProprietaryName) {
        this.nonProprietaryName = nonProprietaryName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public void setMaxDose(int maxDose) {
        this.maxDose = maxDose;
    }

    public void setTherapeuticIndications(String therapeuticIndications) {
        this.therapeuticIndications = therapeuticIndications;
    }

    public void setDosing(String dosing) {
        this.dosing = dosing;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public void setMechanismOfAction(String mechanismOfAction) {
        this.mechanismOfAction = mechanismOfAction;
    }

    public void setDoses(Set<Dose> doses) {
        this.doses = doses;
    }
}
