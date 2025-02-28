package com.gschool.services;

import com.gschool.entities.Filiere;
import java.util.List;

public interface FiliereService {
    void saveFiliere(Filiere filiere);
    void updateFiliere(Filiere filiere);
    void deleteFiliere(Filiere filiere);
    Filiere getFiliereById(int id);
    List<Filiere> getAllFilieres();
}