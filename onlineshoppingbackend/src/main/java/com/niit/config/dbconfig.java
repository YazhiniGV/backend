package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;

@Configuration
@EnableTransactionManagement
public class dbconfig {

    @Bean
    public DataSource getDataSource() {
        System.out.println("Datasource");
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/ecommerce");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
    @Bean
    public SessionFactory sessionFactory() {
        System.out.println("Sessionfactory");
        LocalSessionFactoryBuilder lsf=
                new LocalSessionFactoryBuilder(getDataSource());
        Properties hibernateProperties=new Properties();
        hibernateProperties.setProperty(
                "hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        lsf.addProperties(hibernateProperties);
        Class classes[]=new Class[]{Category.class,Cart.class,Product.class,User.class,Supplier.class};
        
        return lsf.addAnnotatedClasses(classes).buildSessionFactory();
    }
    @Bean
    public HibernateTransactionManager hibTransManagement(){
        return new HibernateTransactionManager(sessionFactory());
    }
}