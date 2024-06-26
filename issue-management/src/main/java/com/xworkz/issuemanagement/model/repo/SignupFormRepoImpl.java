package com.xworkz.issuemanagement.model.repo;

import com.xworkz.issuemanagement.dto.SignupFormDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class SignupFormRepoImpl implements SignupFormRepo {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public SignupFormRepoImpl()
    {
        System.out.println("Created SignupFormRepoImpl");
    }

    @Override
    public boolean save(SignupFormDto signupFormDto) {
        System.out.println("Running save method in SignupFormRepoImpl...");
        EntityManager manager =entityManagerFactory.createEntityManager();
       EntityTransaction transaction = manager.getTransaction();
       try {
           transaction.begin();
           manager.persist(signupFormDto);
           transaction.commit();
       }
       catch (PersistenceException persistenceException)
       {
           persistenceException.printStackTrace();
           transaction.rollback();
       }

       finally {
           manager.close();
       }
        return true;
    }

    @Override
    public SignupFormDto findByEmailAndPassword(String email, String password) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            String query = "SELECT s FROM SignupFormDto s where s.email=:email AND s.password=:password";
            Query query1 = entityManager.createQuery(query);
            query1.setParameter("email", email);
            query1.setParameter("password", password);
            SignupFormDto signUpDTO = (SignupFormDto) query1.getSingleResult();
            System.out.println(signUpDTO);
            entityTransaction.commit();
            return signUpDTO;

        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {
            entityManager.close();
        }
        return null;
    }
}
