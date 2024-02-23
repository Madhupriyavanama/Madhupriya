package com.example.Studentinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_info")
public class Student {
    @Id
    @Generated
    public int id;
    public String name;
    public String email;
    public String phone;
    public String course;
    public String department;
    public String semester;
    public String section;
    public String roll;
    public String password;
}
