import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double sumAllGrades = 0;
        int countAllGrades = 0;
        while(!command.equals("Finish")) {
            String presentation = command;
            double sumGradePerPresentation = 0;
            for (int jury = 1; jury <= countJury ; jury++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumGradePerPresentation += grade;
                sumAllGrades += grade;
            }
            double averageGrade = sumGradePerPresentation / countJury;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);
            command = scanner.nextLine();
        }
        double averageAll = sumAllGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", averageAll);
    }
}
