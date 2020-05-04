package com.rcyc.bonvoy.configuration;

import com.rcyc.bonvoy.utils.EnvironmentConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Project Configurations
 */
@Configuration
public class ProjectConfiguration {

    private final Logger log = LoggerFactory.getLogger(ProjectConfiguration.class);

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

//    @Bean
//    public PlatformTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }

//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager
//                = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(
//                entityManagerFactory().getObject());
//        return transactionManager;
//    }

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(EnvironmentConstants.DB_URL);
        dataSourceBuilder.username(EnvironmentConstants.DB_USERNAME);
        dataSourceBuilder.password(EnvironmentConstants.DB_PASSWORD);
        return dataSourceBuilder.build();
    }

//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setPackagesToScan(new String[]{"com.rcyc.bonvoy.model"});
//        entityManagerFactoryBean.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
//        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//
//        Map<String, Object> jpaProperties = new HashMap<String, Object>();
//        jpaProperties.put("spring.jpa.hibernate.naming.physical-strategy", "org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl");
////        jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
////        jpaProperties.put("hibernate.show_sql", "true");
////        jpaProperties.put("hibernate.format_sql", "true");
////        jpaProperties.put("hibernate.use_sql_comments", "true");
////        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        //jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
//        entityManagerFactoryBean.setJpaPropertyMap(jpaProperties);
//
//        return entityManagerFactoryBean;
//    }

//
//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(EnvironmentConstants.SMTP_HOST);
//        mailSender.setPort(EnvironmentConstants.SMTP_PORT);
//
//        mailSender.setUsername(EnvironmentConstants.EMAIL_USERNAME);
//        mailSender.setPassword(EnvironmentConstants.EMAIL_PASSWORD);
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return mailSender;
//    }

}