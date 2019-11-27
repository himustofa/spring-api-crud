package com.mk.springapicrud.repositories;

import com.mk.springapicrud.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository | CRUD : Create, Read, Update, Delete
// OR extends JpaRepository<Blog, Integer>
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
