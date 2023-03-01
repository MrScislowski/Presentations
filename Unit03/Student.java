public class Student {

    // INSTANCE VARIABLES
    // aka fields, properties, attributes
    public int age;
    public int actScore;
    public boolean hasGraduated;

    // CONSTRUCTOR
    public Student(int studentAge, int studentActScore, boolean studentHasGraduated) {
        age = studentAge;
        actScore = studentActScore;
        hasGraduated = studentHasGraduated;
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
