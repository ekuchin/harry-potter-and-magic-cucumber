package hogwarts;

public class SortingHat {

    public static void sort(Student student) {
        // Houses.GRYFFINDOR - heroes SEA
        // Houses.SLYTHERIN - politics CL
        // Houses.RAVENCLAW - intellectuals PI
        //Houses.HUFFLEPUFF - workers Other

        if (student.getStrength() + student.getEndurance() > 15 && student.getAgility() > 8) {
            student.setHouse(Houses.GRYFFINDOR);
            return;
        }

        if (student.getCharisma() + student.getLuck() > 15) {
            student.setHouse(Houses.SLYTHERIN);
            return;
        }

        if (student.getIntelligence() + student.getPerception() > 15) {
            student.setHouse(Houses.RAVENCLAW);
            return;
        }

        student.setHouse(Houses.HUFFLEPUFF);

    }

}
