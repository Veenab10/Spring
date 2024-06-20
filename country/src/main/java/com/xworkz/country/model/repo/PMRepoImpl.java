package com.xworkz.country.model.repo;

import com.xworkz.country.dto.PMDto;
import com.xworkz.country.dto.PMSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class PMRepoImpl implements PMRepo {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public PMRepoImpl()
    {
        System.out.println("Created PMRepoImpl");
    }

    @Override
    public boolean save(PMDto pmDto) {
        System.out.println("Ruuning save method in PMRepoImpl");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction =entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(pmDto);
            transaction.commit();
        }
        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }
        return true;
    }

    @Override
    public List<PMDto> search(PMSearchDto pmSearchDto) {
        System.out.println("Running search method PMRepoImpl");
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        transaction.begin();

        try {
            String query="select dto from PMDto dto where dto.countryName=:country";
            Query query1 =manager.createQuery(query);
            query1.setParameter("country",pmSearchDto.getCountryName());
           List<PMDto> resultList= query1.getResultList();
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
