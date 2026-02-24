import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alex {
    static class Course {
        int credit;
        String grade;
        int points;
        Course(int credit, String grade) {
            this.credit = credit;
            int point = 0;
            switch (grade.toLowerCase()) {
                case "a":
                    point = 10;
                    break;
                case "a-":
                    point = 9;
                    break;
                case "b":
                    point = 8;
                    break;
                case "b-":
                    point = 7;
                    break;
                case "c":
                    point = 6;
                    break;
                case "c-":
                    point = 5;
                    break;
                case "d":
                    point = 4;
                    break;
                default:
                    System.out.println("Grade invalid");
                    System.exit(0);
                    break;
            }
            this.points = point;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of courses you completed this semester");
        int totalCourses = Integer.parseInt(br.readLine());
        Course[] courses = new Course[totalCourses];
        System.out.println("Enter the total courses one by one in a format 'credits grade', example :- 3 a-, enter the next courses in next lines");
        for(int i=0; i<totalCourses; i++) {
            System.out.println("Enter the course number " + (i+1));
            StringTokenizer st = new StringTokenizer(br.readLine());
            courses[i] = new Course(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        System.out.println("Enter the total credits earned by you in previous semesters and your CPI in a format 'credits cpi', example :- 38 8.36");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int prevCredits = Integer.parseInt(st.nextToken());
        double prevCPI = Double.parseDouble(st.nextToken());
        double thisSemPoints = 0;
        int thisSemCredits = 0;
        for(int i=0; i<totalCourses; i++) {
            Course c = courses[i];
            thisSemCredits += c.credit;
            int point = c.credit * c.points;
            thisSemPoints += point;
        }
        double prevPoints = prevCredits * prevCPI;
        double SPI = thisSemPoints / thisSemCredits;
        System.out.println("Your SPI :- " + SPI);
        double CPI = (thisSemPoints + prevPoints) / (thisSemCredits + prevCredits);
        System.out.println("Your CPI :- " + CPI);
    }
}