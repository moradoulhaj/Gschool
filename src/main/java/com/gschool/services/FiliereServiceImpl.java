package com.gschool.services;

import com.gschool.dao.FiliereDao;
import com.gschool.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereServiceImpl implements FiliereService {

    @Autowired
    private FiliereDao filiereDao;

    @Override
    public void saveFiliere(Filiere filiere) {
        filiereDao.saveFiliere(filiere);
    }

    @Override
    public void updateFiliere(Filiere filiere) {
        filiereDao.updateFiliere(filiere);
    }

    @Override
    public void deleteFiliere(Filiere filiere) {
        filiereDao.deleteFiliere(filiere);
    }

    @Override
    public Filiere getFiliereById(int id) {
        return filiereDao.getFiliereById(id);
    }

    @Override
    public List<Filiere> getAllFilieres() {
        return filiereDao.getFilieres();
    }
}