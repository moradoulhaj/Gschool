package com.gschool.beans;

import com.gschool.entities.Filiere;
import com.gschool.services.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class FiliereBean {

    @Autowired
    private FiliereService filiereService;

    private Filiere filiere = new Filiere();
    private List<Filiere> filieres;

    public void saveFiliere() {
        filiereService.saveFiliere(filiere);
        filiere = new Filiere(); // Reset the form
    }

    public List<Filiere> getFilieres() {
        if (filieres == null) {
            filieres = filiereService.getAllFilieres();
        }
        return filieres;
    }

    // Getters and Setters
    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}