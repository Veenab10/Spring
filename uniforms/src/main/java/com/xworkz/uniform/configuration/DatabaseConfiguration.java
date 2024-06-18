package com.xworkz.uniform.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DatabaseConfiguration {

    public DatabaseConfiguration()
    {
        System.out.println("Created DatabaseConfiguration");
    }

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driver}")
    private String driver;


    @Bean
    public DataSource dataSource()
    {
        System.out.println("Registering datasource");
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driver);
        return  dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource)
    {
        System.out.println("Registering LocalContainerEntityManagerFactoryBean");
        LocalContainerEntityManagerFactoryBean factoryBean=new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        JpaVendorAdapter jpaVendorAdapter=new HibernateJpaVendorAdapter();
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.xworkz.uniform.dto");

        Properties properties=new Properties();
        properties.put("hibernate.show_sql","true");
        factoryBean.setJpaProperties(properties);

        return  factoryBean;

    }

}
