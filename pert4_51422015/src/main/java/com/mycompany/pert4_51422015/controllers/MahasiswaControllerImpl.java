/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert4_51422015.controllers;

import com.mycompany.pert4_51422015.models.MahasiswaModel;
import com.mycompany.pert4_51422015.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author DIO
 */
public class MahasiswaControllerImpl implements MahasiswaController{
    
    @Override
    public void addMahasiswa(MahasiswaModel mhs){
        Transaction trx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            trx = session.beginTransaction();
            session.save(mhs);
            trx.commit();
        }catch (Exception e){
            if (trx != null){
                trx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void updateMahasiswa(MahasiswaModel mhs) {
        Transaction trx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            trx = session.beginTransaction();
            session.update(mhs);
            trx.commit();
        } catch (Exception e){
            if (trx != null){
                trx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMahasiswa(int id) {
        Transaction trx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            trx = session.beginTransaction();
            MahasiswaModel mhs = session.get(MahasiswaModel.class, id);
            if(mhs != null){
                session.delete(mhs);
                System.out.println("Berhasil hapus");
            }
            trx.commit();
        } catch (Exception e){
            if (trx != null){
                trx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<MahasiswaModel> getAllMahasiswa() {
        Transaction trx = null;
        List<MahasiswaModel> listMhs = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            trx = session.beginTransaction();
            // Using HQL (Hibernate Query Language) to fetch all records
            Query<MahasiswaModel> query = session.createQuery("from MahasiswaModel", MahasiswaModel.class);
            listMhs = query.list(); // Fetch all results

            trx.commit(); // Commit transaction
        } catch (Exception e) {
            if (trx != null) {
                trx.rollback(); // Rollback transaction in case of error
            }
            e.printStackTrace();
        }

        // Return the fetched list
        return listMhs;
    }

    @Override
    public MahasiswaModel getMahasiswaById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
