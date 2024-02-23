package com.example.Studentinfo.service;

import com.example.Studentinfo.model.Student;
import com.example.Studentinfo.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {
    @Autowired
    private Studentrepo repo;

    public Student createstudent(Student student) {
        return repo.save(student);
    }

    public List<Student> createstudents(List<Student> students) {
        return repo.saveAll(students);

    }

    public List<Student> getstudents() {
        return repo.findAll();

    }

    public Student getstudent(int id) {
        return repo.findById(id).orElse(null);

    }

    public String deletestudent(int id) {
        repo.deleteById(id);
        return "student data is deleted with  " + id;

    }

    public Student updatestudent(int id, Student updatedStudent) {
        Optional<Student> optionalStudent = repo.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setCourse(updatedStudent.getCourse());
            existingStudent.setDepartment(updatedStudent.getDepartment());
            existingStudent.setSemester(updatedStudent.getSemester());
            existingStudent.setSection(updatedStudent.getSection());
            existingStudent.setRoll(updatedStudent.getRoll());
            existingStudent.setPassword(updatedStudent.getPassword());
            return repo.save(existingStudent);
        } else {
            throw new RuntimeException("Student not found with id: " + id);


        }

    }
}

