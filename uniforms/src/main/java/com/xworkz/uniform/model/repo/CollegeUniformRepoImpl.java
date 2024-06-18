package com.xworkz.uniform.model.repo;

import com.xworkz.uniform.dto.CollegeUniformDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

@Repository
public class CollegeUniformRepoImpl implements CollegeUniformRepo{


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public  CollegeUniformRepoImpl()
    {
        System.out.println("Created CollegeUniformRepoImpl");
    }
    @Override
    public boolean save(CollegeUniformDto collegeUniformDto) {
        System.out.println("Running save method in CollegeUniformRepoImpl");
        EntityManager manager=this.entityManagerFactory.createEntityManager();
        EntityTransaction tx= manager.getTransaction();
        try{
            tx.begin();
            manager.persist(collegeUniformDto);
            tx.commit();

        }catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            tx.rollback();
        }
        finally {
            manager.close();

        }

        return true;



    }
}
