/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert6_dio_AOP;

import com.mycompany.pert6_dio_AOP.Controlles.MahasiswaController;
import com.mycompany.pert6_dio_AOP.Services.MahasiswaService;
import com.mycompany.pert6_dio_AOP.Utils.DatabaseConnection;
import com.mycompany.pert6_dio_AOP.Views.MahasiswaView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author DIO
 */
@SpringBootApplication
public class SpringBootApp implements ApplicationRunner{
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false"); // Disable headless mode
        
        // Start the Spring Application and get the application context
        ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
        
        // Instantiate the view and inject the controller manually
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        MahasiswaView mahasiswaView = new MahasiswaView(controller);
        mahasiswaView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}

