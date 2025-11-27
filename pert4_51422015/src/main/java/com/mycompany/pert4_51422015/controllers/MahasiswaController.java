/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert4_51422015.controllers;
import com.mycompany.pert4_51422015.models.MahasiswaModel;
import java.util.List;

/**
 *
 * @author DIO
 */
public interface MahasiswaController {
    public void addMahasiswa(MahasiswaModel mhsModel);
    public MahasiswaModel getMahasiswaById(int id);
    public List<MahasiswaModel> getAllMahasiswa();
    public void updateMahasiswa(MahasiswaModel mhsModel);
    public void deleteMahasiswa(int id); 
}