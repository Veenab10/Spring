package com.xworkz.country.model.repo;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.security.util.PendingException;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class ContactRepoImpl implements ContactRepo{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public ContactRepoImpl()
    {
        System.out.println("Created ContactRepoImpl");
    }

    @Override
    public boolean save(ContactDto contactDto) {
        System.out.println("Ruuning save method in ContactRepoImpl");
        EntityManager manager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction =manager.getTransaction();

        try {
            transaction.begin();
            manager.persist(contactDto);
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
    public List<ContactDto> search(ContactSearchDto contactSearchDto) {
        System.out.println("Running search method in ContactRepoImpl");
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        transaction.begin();
        try {
            String query="select dto from ContactDto dto where dto.name=:cname";
            Query query1 =manager.createQuery(query);
            query1.setParameter("cname",contactSearchDto.getName());
            List<ContactDto> resultList=query1.getResultList();
            transaction.commit();
            return resultList;
        }
        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            transaction.rollback();
        }
        finally {
            manager.close();
        }
        return Collections.emptyList();
    }
}
