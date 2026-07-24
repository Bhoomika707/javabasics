import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Question {
    String question;
    String[] options;
    int answer;

    public Question(String question, String[] options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}

public class QuizApplication {

    static Scanner sc = new Scanner(System.in);
    static boolean timeUp;

    public static void main(String[] args) {

        Question[] questions = {
                new Question("1. Which language is platform independent?",
                        new String[]{"1. C", "2. Java", "3. C++", "4. Python"}, 2),

                new Question("2. Which keyword is used to create an object?",
                        new String[]{"1. class", "2. object", "3. new", "4. this"}, 3),

                new Question("3. Which company developed Java?",
                        new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Google", "4. Apple"}, 2)
        };

        int score = 0;

        for (Question q : questions) {

            System.out.println("\n" + q.question);

            for (String option : q.options) {
                System.out.println(option);
            }

            timeUp = false;

            Timer timer = new Timer();

            timer.schedule(new TimerTask() {
                public void run() {
                    timeUp = true;
                    System.out.println("\nTime's Up!");
                }
            }, 10000);

            System.out.print("Enter your answer: ");

            long start = System.currentTimeMillis();

            int userAnswer = sc.nextInt();

            long end = System.currentTimeMillis();

            timer.cancel();

            if ((end - start) > 10000) {
                System.out.println("Answer not accepted.");
            } else if (userAnswer == q.answer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n=== RESULT ===");
        System.out.println("Score: " + score + "/" + questions.length);

        sc.close();
    }
}