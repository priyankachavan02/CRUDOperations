package com.studentmanagement.CRUD.repository;

//this layer is responsible for communicating with databases

/*
it performs
save data, fetch data, update data, delete data */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagement.CRUD.entity.Student;

//imports repository annotaions, it tells class that this class is responsible for db operionas.

@Repository
//this class/interface is responsible for db operations
//internally it creates object automatically (DI)
public interface StudentRepository extends JpaRepository<Student, Long>
{
    //studentrepo inherits all the methods from JPArepo here we have student class and id which is long
}
//Repository is responsible for database operations. By extending JpaRepository, we automatically get methods like save(), findAll(), findById(), and deleteById().

