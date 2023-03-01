public class Student {

    // INSTANCE VARIABLES
    // aka fields, properties, attributes
    private int age;
    private int actScore;
    private boolean hasGraduated;

    // CONSTRUCTOR
    public Student(int studentAge, int studentActScore, boolean studentHasGraduated) {
        age = studentAge;
        actScore = studentActScore;
        hasGraduated = studentHasGraduated;
    }

    // ACCESSOR METHODS
    public int getAge() {
        return age;
    }

    public int getActScore() {
        return actScore;
    }

    public boolean getGraduationStatus() {
        return hasGraduated;
    }

    // INSTANCE METHODS
    public String toString() {
        String result = "";
        result += age + " year old student";
        result += " with an ACT score of " + actScore;
        if (hasGraduated) {
            result += " (former student)";
        }

        return result;
    }
}
