/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert5_dio;

import com.mycompany.pert5_dio.Controlles.MahasiswaController;
import com.mycompany.pert5_dio.Utils.DatabaseConnection;
import com.mycompany.pert5_dio.Views.MahasiswaView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Hanif Zhafran
 */
@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        DatabaseConnection dbConnection = context.getBean(DatabaseConnection.class);

        // inject ke view
        MahasiswaView view = new MahasiswaView(controller, dbConnection);
        view.menu();

        System.out.println("\nAplikasi ditutup. Terima kasih!");
        SpringApplication.exit(context, () -> 0);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}

