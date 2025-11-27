/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_dio_AOP.Services;

import com.mycompany.pert6_dio_AOP.Models.MahasiswaModel;
import com.mycompany.pert6_dio_AOP.Repositories.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dio
 */
@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository repository;
    
    public void addMahasiswa(MahasiswaModel mhs){
        repository.save(mhs);
    }
    
    public MahasiswaModel getMahasiswaById(int id){
        return repository.findById(id).orElse(null);
    }
    
    public List<MahasiswaModel> getAllMahasiswa(){
        return repository.findAll();
    }
    
    public void updateMahasiswa(MahasiswaModel mhs){
        repository.save(mhs);
    }
    
    public void deleteMahasiswaById(int id){
        repository.deleteById(id);
    }
}
