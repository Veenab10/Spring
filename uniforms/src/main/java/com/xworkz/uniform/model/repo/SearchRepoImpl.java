package com.xworkz.uniform.model.repo;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.dto.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class SearchRepoImpl implements  SearchRepo {

    @Autowired
    private  EntityManagerFactory entityManagerFactory;

    public SearchRepoImpl()
    {
        System.out.println("Created SearchRepoImpl");
    }


    @Override
    public List<CollegeUniformDto> search(SearchDto searchDto) {
        System.out.println("Running search method in SearchRepoImpl ");
        EntityManager entityManager =this.entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction =entityManager.getTransaction();
        entityTransaction.begin();


        try {
            String query="select dto from CollegeUniformDto dto where dto.collegeName=:cname";
            Query query1 =entityManager.createQuery(query);
            query1.setParameter("cname",searchDto.getCollegeName());
            List<CollegeUniformDto> resultList=query1.getResultList();


            entityTransaction.commit();
return  resultList;
        }
        catch (PersistenceException persistenceException)
        {
            persistenceException.printStackTrace();
            entityTransaction.rollback();
        }
        finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
