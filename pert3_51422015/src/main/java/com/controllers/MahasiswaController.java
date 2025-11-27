/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.models.MahasiswaDAO;
import com.models.MahasiswaModel;
import java.util.List;

/**
 *
 * @author DIO
 */
public class MahasiswaController {
     private MahasiswaDAO mhsDAO;
    
    // constructor
    public MahasiswaController(MahasiswaDAO mhsDAO){
        this.mhsDAO = mhsDAO;
    }
    // add
    public void addMahasiswa (String npm, String nama, int semester, float ipk){
        MahasiswaModel mhsModel = new MahasiswaModel (0, npm, nama, semester, ipk);
        mhsDAO.addMahasiswa (mhsModel);
    }
    // get all
    public List<MahasiswaModel> getAllMahasiswa () {
        return mhsDAO.getAllMahasiswa();
    }
    //update
    public void updateMahasiswa (int id, String nama,String npm, int semester, float ipk){
        MahasiswaModel mhsModel = new MahasiswaModel (id, npm, nama, semester, ipk);
    }
            
    //delete
    public void deleteById (int id){
        mhsDAO.deleteById(id);
    }

}
