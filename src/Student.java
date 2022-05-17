import java.util.Random;

/*
If Statement 03
Exercise: If Statement 3

define a class called Student that has:
2 instance variables:
a string name
an integer age
a constructor method that takes as parameters studentName and studentAge, assigning the values to the 2 instance variables
a method guessingAge that:
generates a random integer (using java.util.Random and nextInt()) that has 35 as upperbound
prints the random value generated for name (e.g. I generated the random number X for student Y)
prints if the random value is equal, greater or lower to the Student's age
 */
public class Student {
    String name;
    int age;

    public Student(String StudentName, int srudentAge) {
        this.name = StudentName;
        this.age = srudentAge;
    }

    public void guessinAge(){

        int random = new Random().nextInt(35);

        System.out.printf("I generated the random number %d for student %s%n",random,name);

        if (random == age){
            System.out.printf("The random number equals %s's age",name);
        } else if (random > age) {
            System.out.printf("The random number is greater than %s's age",name);
        } else {
            System.out.printf("The random number is less than %s's age",name);
        }
    }
}
