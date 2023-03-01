public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 16;
        s1.actScore = 21;
        s1.hasGraduated = false;

        Student s2 = new Student();
        s2.age = 24;
        s2.actScore = 29;
        s2.hasGraduated = true;

        Student s3 = new Student();
        s3.age = 14;
        s3.actScore = 15;
        s3.hasGraduated = false;

        Student[] allStudents = new Student[] {s1, s2, s3};

        // calculate the average act score of all current students
        int allActTotal = 0;
        int activeStudents = 0;
        for (Student curStudent : allStudents) {
            if (curStudent.hasGraduated == false) {
                allActTotal += curStudent.actScore;
                activeStudents++;
            }
        }
        System.out.println("There are " + activeStudents + " who have an average score of " + (double) allActTotal / activeStudents);


    }
}
