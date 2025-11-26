public class Student {
    private String name;
    private int noMatrix;
    private int part;
    private Subject[] subject = new Subject[1];

    public Student(String name, int noMatrix, int part, Subject[] subject) {
        this.name = name;
        this.noMatrix = noMatrix;
        this.part = part;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoMatrix(int noMatrix) {
        this.noMatrix = noMatrix;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getNoMatrix() {
        return noMatrix;
    }

    public int getPart() {
        return part;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public double calcGPA() {
        double gpa = 0.00;
        double[] gradePoint = new double[subject.length];

        // Get total grade point and stores it into gpa
        for (int i = 0; i < subject.length; i++) {
            if (subject[i].getGrade().equalsIgnoreCase("A+") || subject[i].getGrade().equalsIgnoreCase("A"))
                gradePoint[i] = 4.00;
            else if (subject[i].getGrade().equalsIgnoreCase("A-"))
                gradePoint[i] = 3.67;
            else if (subject[i].getGrade().equalsIgnoreCase("B+"))
                gradePoint[i] = 3.33;
            else if (subject[i].getGrade().equalsIgnoreCase("B"))
                gradePoint[i] = 3.00;
            else if (subject[i].getGrade().equalsIgnoreCase("B-"))
                gradePoint[i] = 2.67;
            else if (subject[i].getGrade().equalsIgnoreCase("C+"))
                gradePoint[i] = 2.33;
            else if (subject[i].getGrade().equalsIgnoreCase("C"))
                gradePoint[i] = 2.00;
            else if (subject[i].getGrade().equalsIgnoreCase("C-"))
                gradePoint[i] = 1.67;
            else if (subject[i].getGrade().equalsIgnoreCase("D+"))
                gradePoint[i] = 1.33;
            else if (subject[i].getGrade().equalsIgnoreCase("D"))
                gradePoint[i] = 1.00;
            else if (subject[i].getGrade().equalsIgnoreCase("E"))
                gradePoint[i] = 0.67;
            else
                gradePoint[i] = 0.00;
            gpa += gradePoint[i] * subject[i].getCreditHour();
        }

        // get the total credit hours and divide with gpa (total grade points) and
        // stores it there
        int totalCreditHours = 0;
        for (int i = 0; i < subject.length; i++) {
            totalCreditHours += subject[i].getCreditHour();
        }
        return gpa /= totalCreditHours;
    }

    public String toString() {
        String str1 = "";
        String str2 = "";
        String str3 = "";

        for (int i = 0; i < subject.length; i++) {
            str1 = String.format("\n\nStudent Name: %s\nNo. Matrix: %d\nPart: %d\nCourse: %s", name, noMatrix, part,
                    subject[i].getCodeSubject());
            str2 = String.format(
                    "\n\nCode Subject\t\tSubject\t\tGrade\t\tGradePoint\t\tCredit Hours\t\tQuality Points (GP x CH)");

            double[] gradePoint = new double[subject.length];
            for (int j = 0; j < subject.length; j++) {
                if (subject[j].getGrade().equalsIgnoreCase("A+") || subject[j].getGrade().equalsIgnoreCase("A"))
                    gradePoint[j] = 4.00;
                else if (subject[j].getGrade().equalsIgnoreCase("A-"))
                    gradePoint[j] = 3.67;
                else if (subject[j].getGrade().equalsIgnoreCase("B+"))
                    gradePoint[j] = 3.33;
                else if (subject[j].getGrade().equalsIgnoreCase("B"))
                    gradePoint[j] = 3.00;
                else if (subject[j].getGrade().equalsIgnoreCase("B-"))
                    gradePoint[j] = 2.67;
                else if (subject[j].getGrade().equalsIgnoreCase("C+"))
                    gradePoint[j] = 2.33;
                else if (subject[j].getGrade().equalsIgnoreCase("C"))
                    gradePoint[j] = 2.00;
                else if (subject[j].getGrade().equalsIgnoreCase("C-"))
                    gradePoint[j] = 1.67;
                else if (subject[j].getGrade().equalsIgnoreCase("D+"))
                    gradePoint[j] = 1.33;
                else if (subject[j].getGrade().equalsIgnoreCase("D"))
                    gradePoint[j] = 1.00;
                else if (subject[j].getGrade().equalsIgnoreCase("E"))
                    gradePoint[j] = 0.67;
                else
                    gradePoint[j] = 0.00;
            }
            str3 = String.format("\n%s\t\t%.2f\t\t\t%d\t\t\t%.2f", subject[i], gradePoint[i],
                    subject[i].getCreditHour(),
                    calcGPA());
        }
        return str1 + str2 + str3;
    }
}
