import java.util.Scanner;

public class Main{

	public static double getMin(double[] arr){
		double min = arr[0];

		for(int i = 0;i < arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	public static void bestOption(double[] quizzes, double[] assignments){
		// percent of quizzes and assignments are for compared to total grade
		double quizPercentage = 0.15;
		double assignmentPercentage = 0.25;

		// quiz and assignment totals
		double quizTotal = 0.0;
		double assignmentsTotal = 0.0;

		// lowest graded quiz and assignment
		double lowestQuiz = getMin(quizzes);
		double lowestAssignment = getMin(assignments);

		for(int i = 0;i < quizzes.length;i++){
			quizTotal += quizzes[i];
		}

		for(int i = 0;i < assignments.length;i++){
			assignmentsTotal += assignments[i];
		}

		// percentage differce between original and subtracting
		double quizPercentDifference = (quizTotal * quizPercentage) - ((quizTotal - lowestQuiz) * quizPercentage);
		double assignmentPercentDifference = ((assignmentsTotal + 10) * assignmentPercentage) - (assignmentsTotal * assignmentPercentage);


		if(assignmentPercentDifference > quizPercentDifference){
			System.out.println("Add ten to an assignment");
		}
		else{
			System.out.println("Drop a quiz");
		}
	}

	public static void main(String[] args){

		// all quizzes and assignments
		double[] quizzes = {90.0, 100.0, 100.0, 90.0, 100.0, 80.0, 80.0};
		double[] assignments = {84.0, 59.0, 95.0, 95.0, 92.25, 86.0, 100.0};

		bestOption(quizzes, assignments);

		System.out.println();
	}
}




