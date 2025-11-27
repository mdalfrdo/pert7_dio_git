    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_dio_AOP.Controlles;

import com.mycompany.pert6_dio_AOP.Services.MahasiswaService;
import com.mycompany.pert6_dio_AOP.Models.MahasiswaModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Dio
 */
@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public void addMahasiswa(@RequestBody MahasiswaModel mhs){
        mahasiswaService.addMahasiswa(mhs);
    }
    
    public MahasiswaModel getMahasiswaById(@PathVariable int id){
        return mahasiswaService.getMahasiswaById(id);
    }
    
    public List<MahasiswaModel> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }
    
    public void updateMahasiswa(@RequestBody MahasiswaModel mhs){
        mahasiswaService.updateMahasiswa(mhs);
    }
    
    public void deleteMahasiswaById(@PathVariable int id){
        mahasiswaService.deleteMahasiswaById(id);
    }
}

