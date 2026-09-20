/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question 7
*/

public class Student{
//private fields for storing student information
    private String name;
    private int age;
    private double gpa;

//Constructor used to initialize a Student object
public Student(String name, int age, double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
}

//Getter for the Student's name
public String getName() {
    return name;
}

//Getter fot the Student's age
public int getAge() {
    return age;
}    

//Getter for the Student's GPA
public double getGpa() {
    return gpa;
}
}
