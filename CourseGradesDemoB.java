import AnalyzableInterface.*;

public class CourseGradesDemoB

{

   public static void main(String[] args)

   {

      // Create an object for the lab grade.

      GradedActivity lab = new GradedActivity();

      // Set the lab socre at 85.

      lab.setScore(85);



      // Create an object for the pass/fail exam.

      // 10 total questions, 1 questions missed, minimum

      // passing score is 70.

      PassFailExam pfexam = new PassFailExam(10, 1, 70);



      // Create an object for the essay grade.

      Essay essay = new Essay(25, 18, 17, 20);

      // Set the essay scores. Grammer = 25, spelling = 18

      // length = 17, content = 20.

      essay.setTotal();



      // Create an object for the final exam.

      // 50 questions, 10 missed.

      FinalExam finalExam = new FinalExam(50, 10);



      // Create a CourseGrades object.

      CourseGradesB course = new CourseGradesB();

      course.setLab(lab);

      course.setPassFailExam(pfexam);

      course.setEssay(essay);

      course.setFinalExam(finalExam);



      // Display the scores and grades.

      System.out.println(course);



      // Display the average numeric score.

      System.out.println("Average score: " +

                         course.getAverage());



      // Get the item with the highest score.

      GradedActivity highItem = course.getHighest();

      System.out.println("Highest score: " +

                          highItem.getScore());



      // Get the item with the lowest score.

      GradedActivity lowItem = course.getLowest();

      System.out.println("Lowest score: " +

                          lowItem.getScore());

   }

}