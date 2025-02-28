package com.gschool.dao;

import com.gschool.entities.Filiere;

import java.util.List;

public interface FiliereDao {
    void saveFiliere(Filiere filiere);
    void updateFiliere(Filiere filiere);
    void deleteFiliere(Filiere filiere);
    Filiere getFiliere(int id);
    List<Filiere> getFilieres();
}
