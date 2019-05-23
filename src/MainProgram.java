import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("--University Menu--");
			System.out.println("1. All Student Data");
			System.out.println("2. All Tutor Data");
			System.out.println("3. About this University");
			System.out.println("4. Exit Application");
			System.out.println("Choose a menu: ");
			int inputMenu = scanner.nextInt();
			scanner.nextLine();
			switch(inputMenu)
			{
			case 1:
				ShowStudents.studentInfo();
				break;
			case 2:
				ShowTutor.tutorInfo();
				break;
			case 3:
				System.out.printf("Universitas ini bernama Unicorn (University of Cornfield).\nSudah didirikan sejak  12 December 1978 di Amerika Serikat, Southern State, di kota Texas.\n");
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please input from 1-4: ");
				break;
			}
			
		}
		
		
		
	}

}
