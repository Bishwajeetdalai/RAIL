package com.bishwa.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.bishwa.entity.Student;

public class StudentDaoImpl implements  StudentDao{

	 private HibernateTemplate hibernateTemplate ;

	    public StudentDaoImpl() {
	    }

	    public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }


	    @Transactional
	    public int insert(Student student) {

	        return (int) this.hibernateTemplate.save(student);
	    }


	    @Transactional
	    public void update(Student student) {

	       hibernateTemplate.update(student);
	    }

	@Transactional
	    public void delete(int id) {
	        hibernateTemplate.delete(id);
	    }

	@Transactional
	    public Student getById(int id) {

	        return hibernateTemplate.get(Student.class,id);

	    }

	@Transactional
	    public List<Student> getAll() {
	        List<Student> list = hibernateTemplate.loadAll(Student.class);
	        return list;
	    }


	    public HibernateTemplate getHibernateTemplate() {
	        return hibernateTemplate;
	    }

	    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
}
