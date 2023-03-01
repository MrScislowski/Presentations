public class School {
    public static void main(String[] args) {
        Student s1 = new Student(16, 21, false);
        Student s2 = new Student(24, 29, true);
        Student s3 = new Student(14, 15, false);

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


        // print a summary of all (past and and current) students
        System.out.println("Here are all the students ever:");
        for (Student curStudent : allStudents) {
            System.out.println(curStudent);
        }


    }
}
