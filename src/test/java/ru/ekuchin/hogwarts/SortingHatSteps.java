package ru.ekuchin.hogwarts;

import hogwarts.Houses;
import hogwarts.SortingHat;
import hogwarts.Student;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class SortingHatSteps {

    protected Student student;

    @Given("Student is Harry Potter")
    public void studentIsHarryPotter() {
        student = Student.builder()
                .name("Harry Potter")
                .strength(6)
                .perception(9)
                .endurance(10)
                .charisma(8)
                .intelligence(9)
                .agility(9)
                .luck(10)
                .build();
    }

    @Given("Student is Draco Malfoy")
    public void studentIsDracoMalfoy() {
        student = Student.builder()
                .name("Draco Malfoy")
                .strength(6)
                .perception(7)
                .endurance(6)
                .charisma(9)
                .intelligence(8)
                .agility(7)
                .luck(9)
                .build();
    }

    @Given("Student is Luna Lovegood")
    public void studentIsLunaLovegood() {
        student = Student.builder()
                .name("Luna Lovegood")
                .strength(5)
                .perception(9)
                .endurance(7)
                .charisma(9)
                .intelligence(10)
                .agility(7)
                .luck(6)
                .build();
    }

    @Given("Student is Cedric Diggory")
    public void studentIsCedricDiggory() {
        student = Student.builder()
                .name("Cedric Diggory")
                .strength(6)
                .perception(7)
                .endurance(7)
                .charisma(10)
                .intelligence(6)
                .agility(7)
                .luck(5)
                .build();
    }

    @When("Sorting Hat makes it's decision")
    public void sortingHatMakesItSDecision() {
        SortingHat.sort(student);
    }

    @Then("Student goes to Gryffindor")
    public void studentGoesToGryffindor() {
        assertEquals(Houses.GRYFFINDOR, student.getHouse());
    }

    @Then("Student goes to Slytherin")
    public void studentGoesToSlytherin() {
        assertEquals(Houses.SLYTHERIN, student.getHouse());
    }


    @Then("Student goes to Ravenclaw")
    public void studentGoesToRavenclaw() {
        assertEquals(Houses.RAVENCLAW, student.getHouse());
    }

    @Then("Student goes to Hufflepuff")
    public void studentGoesToHufflepuff() {
        assertEquals(Houses.HUFFLEPUFF, student.getHouse());
    }


}
