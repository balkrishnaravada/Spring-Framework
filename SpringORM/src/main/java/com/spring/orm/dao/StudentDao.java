package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;


public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Student getStudent(int id)
	{
		Student s1=this.hibernateTemplate.get(Student.class,id);
		
		return s1;
		
	}
	
	public List<Student> getALLStudents()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		
		return students;
	}
	
	@Transactional
	public boolean deleteStudent(int id)
	{
		Student s1=this.hibernateTemplate.get(Student.class,id);
		this.hibernateTemplate.delete(s1);
		return true;
	}
	
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}

}
