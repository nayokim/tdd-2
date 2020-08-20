# tdd-2
Part One: The Test Driven Development Cycle (Red, Green, Refactor)
We will follow the best practices of TDD, and we will create our tests first and write production code once we see the test fail. We will create a Student and a StudentTest class for a grades application, before you start let's analyse the requirements for the Student class:

id should be a long number used to represent a "unique user" in our application.
name is a String that holds the name of the student.
grades is an ArrayList that contains a list of Integer numbers.
Create a new branch called students-tests and read carefully the next instructions.

Create a StudentTest.java class file inside of src/test/java (you might have to create these folders yourself) and remember to write the test before the actual production code. We will simulate the C(reate) R(ead) from the CRUD functionality in our grades application, you should be able to test and create the following requirements:

The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
The Student class should have the following methods:
    // returns the student's id
    public long getId(){...}

    // returns the student's name
    public String getName(){...}

    // adds the given grade to the grades list
    public void addGrade(int grade){...}
  
    // returns the list of grades
    public ArrayList<Integer> getGrades(){...}

    // returns the average of the students grades
    public double getGradeAverage(){...}
As always, commit and push all your changes once you're done.
At the end of the exercise you will end up with a Student.java and a StudentTest.java class.
Bonus
Go ahead and try to add the rest of the CRUD tests and functionality, write the methods for updateGrade() and deleteGrade() in the Student class.
