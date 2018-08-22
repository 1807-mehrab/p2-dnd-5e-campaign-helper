package com.revature.dndhelper.HibernateConfig;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.dao.CharacterSkillsDao;
import com.revature.dndhelper.dao.CharacterStatsDao;
import com.revature.dndhelper.dao.UserDao;
import com.revature.dndhelper.service.CharacterService;
import com.revature.dndhelper.service.CharacterSkillsService;
import com.revature.dndhelper.service.CharacterStatsService;
import com.revature.dndhelper.service.UserService;



@Configuration
@ComponentScan("com.revature.dndhelper")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public DataSource myDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));

		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.revature.dndhelper" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	Properties hibernateProperties() {
		return new Properties() {
			{
				setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
				setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
			}
		};
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager tm = new HibernateTransactionManager();
		tm.setSessionFactory(sessionFactory);
		
		return tm;
	}
	
	@Bean
	public CharacterDao characterDao(SessionFactory sessionFactory) {
		CharacterDao dao = new CharacterDao();
		dao.setSessionFactory(sessionFactory);
		
		return dao;
	}
	
	@Bean
	public CharacterSkillsDao characterSkillsDao(SessionFactory sessionFactory) {
		CharacterSkillsDao dao = new CharacterSkillsDao();
		dao.setSessionFactory(sessionFactory);
		
		return dao;
	}
	
	@Bean
	public CharacterStatsDao characterStatsDao(SessionFactory sessionFactory) {
		CharacterStatsDao dao = new CharacterStatsDao();
		dao.setSessionFactory(sessionFactory);
		
		return dao;
	}
	
	@Bean
	public UserDao userDao(SessionFactory sessionFactory) {
		UserDao dao = new UserDao();
		dao.setSessionFactory(sessionFactory);
		
		return dao;
	}
	
	@Bean
	public CharacterService characterService(CharacterDao characterDao) {
		CharacterService cs = new CharacterService();
		cs.setDao(characterDao);
		
		return cs;
	}
	
	@Bean
	public CharacterSkillsService characterSkillsService(CharacterSkillsDao characterSkillsDao) {
		CharacterSkillsService cs = new CharacterSkillsService();
		cs.setDao(characterSkillsDao);
		
		return cs;
	}
	
	@Bean
	public CharacterStatsService characterStatsService(CharacterStatsDao characterStatsDao) {
		CharacterStatsService cs = new CharacterStatsService();
		cs.setDao(characterStatsDao);
		
		return cs;
	}
	
	@Bean 
	public UserService userService(UserDao userDao) {
		UserService us = new UserService();
		us.setDao(userDao);
		
		return us;
	}

}

