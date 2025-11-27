/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert3_51422015;

import com.controllers.MahasiswaController;
import com.models.MahasiswaDAO;
import com.views.MahasiswaView;

/**
 *
 * @author DIO
 */
public class Pert3_51422015 {
       public static void main(String[] args) {
       MahasiswaDAO mhsDAO = new MahasiswaDAO();
       MahasiswaController mhsController = new MahasiswaController (mhsDAO);
       MahasiswaView mhsView = new MahasiswaView (mhsController);
       mhsView.menu();
       }

}
