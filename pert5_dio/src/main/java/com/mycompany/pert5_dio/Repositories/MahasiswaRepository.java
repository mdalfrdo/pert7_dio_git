/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pert5_dio.Repositories;

import com.mycompany.pert5_dio.Models.MahasiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dio
 */
@Repository
public interface MahasiswaRepository  extends JpaRepository<MahasiswaModel, Integer>{
    
}
