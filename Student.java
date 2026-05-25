package com.studentmanagement.CRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id //we are making id as a  primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    ///generatedvalue automatically generates primary key id using db auto-increment feature
    private Long id; // id column in db
    private String name; //stores the names
    private String email; //stores the email
    private String course; //stores the course
   //id | name | email | course

   public Student(){} //default constructor to initilise object. reqquired by JPA
   public Student(Long id, String name, String email, String course)
  {
//cretaed constructor to quickly create objects
//this act as a reference variable pointing to current object
   this.id = id;
   this.name = name;
   this.email = email;
   this.course = course;
  }
public Long getId()
{
    return id;
}
public void setId(Long id)
{
    this.id = id;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name = name;
}
public String getEmail()
{
    return email;
}
public void setEmail(String email)
{
    this.email = email;
}
public String getCourse()
{
    return course;
}
public void setCourse(String course)
{
    this.course = course;
}

/*
This class helps Spring boot
1. create database table
2. store student data
3. fetch student data
4. update data
5. delete data

when API receives (it gives json) so spring convert
json to student object
then JPA converts the object to database row.
this is called ORM (Object relational mapping)
mapping java objects to db tables
*/
}
