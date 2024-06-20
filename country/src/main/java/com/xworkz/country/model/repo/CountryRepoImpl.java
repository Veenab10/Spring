package com.xworkz.country.model.repo;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.CountrySearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class CountryRepoImpl implements CountryRepo{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public  CountryRepoImpl()
    {
        System.out.println("Created CountryRepoImpl");
    }

    @Override
    public boolean save(CountryDto countryDto) {
        System.out.println("Ruuning save method in CountryRepoImpl");
        EntityManager manager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction =manager.getTransaction();
        try {
            transaction.begin();
            manager.merge(countryDto);
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
    public List<CountryDto> search(CountrySearchDto countrySearchDto) {
        System.out.println("ruuning search method in CountryRepoImpl");
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        try{
            String query="select dto from CountryDto dto where dto.name=:cname";
            Query query1 =entityManager.createQuery(query);
            query1.setParameter("cname",countrySearchDto.getName());
            List<CountryDto> resultList=query1.getResultList();
            transaction.commit();
            return resultList;
        }
        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

        return Collections.emptyList();
    }

    @Override
    public CountryDto findById(int id) {
        System.out.println("running findById method in CountryRepoImpl.. ");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();

        try{
            String query="select dto  from CountryDto dto where dto.id=:cid";
            Query query1=entityManager.createQuery(query);
            query1.setParameter("cid",id);
            CountryDto  singleResult= (CountryDto) query1.getSingleResult();
            transaction.commit();
            return singleResult;
        }

        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            transaction.rollback();
        }
        finally {
            entityManager.close();
        }
        return CountryRepo.super.findById(id);
    }
}
