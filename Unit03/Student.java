public class Student {

    // INSTANCE VARIABLES
    // aka fields, properties, attributes
    private int allData;

    // CONSTRUCTOR
    public Student(int studentAge, int studentActScore, boolean studentHasGraduated) {
        allData = studentAge;
        // 16
        allData *= 100;
        // 1600
        allData += studentActScore;
        // 1624
        allData *= 10;
        // 16240
        if (studentHasGraduated) {
            allData += 1;
        } else {
            allData += 0;
        }
    }

    // ACCESSOR METHODS
    public int getAge() {
        return allData/1000;
    }

    public int getActScore() {
        return (allData/10) % 100;
    }

    public boolean getGraduationStatus() {
        if (allData % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // INSTANCE METHODS
    public String toString() {
        String result = "";
        result += getAge() + " year old student";
        result += " with an ACT score of " + getActScore();
        if (getGraduationStatus()) {
            result += " (former student)";
        }

        return result;
    }
}
