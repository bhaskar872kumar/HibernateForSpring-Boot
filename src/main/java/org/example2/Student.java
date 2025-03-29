package org.example2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")  // Maps to table "Student"
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int rollNo;
    private String name;
    private int marks;
@OneToMany
    private List<Laptop> laptop=new ArrayList<Laptop>();

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
    public List<Laptop> getLaptop() {
        return laptop;
    }
}
