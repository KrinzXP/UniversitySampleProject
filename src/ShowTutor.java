import java.time.*;
import java.math.*;
import java.util.*;
public class ShowTutor {
	public static void tutorInfo()
	{
		LinkedList<String> ajaranAntik = new LinkedList<String>();
		ajaranAntik.add(MataKuliah.ID.getFullName());
		ajaranAntik.add(MataKuliah.NS.getFullName());
		
		Dosen antik = new Dosen("Antik", "Haya", LocalDate.of(1988, Month.NOVEMBER, 12),"Jakarta",
								Gender.FEMALE,"312008912111988002",Religion.MUSLIM,BloodType.A,
								"T701", new BigDecimal(6500000),ajaranAntik);
		
		LinkedList<String> ajaranCahya = new LinkedList<String>();
		ajaranCahya.add(MataKuliah.OOP.getFullName());
		ajaranCahya.add(MataKuliah.JF.getFullName());
		ajaranCahya.add(MataKuliah.DF.getFullName());
		
		Dosen cahya = new Dosen("Cahya", "Subroto", LocalDate.of(1989, Month.JANUARY, 7),"Surabaya",
								Gender.MALE,"312008907011989002", Religion.MUSLIM,BloodType.B,
								"T808", new BigDecimal(8800000), ajaranCahya);
		
		LinkedList<Dosen>dosen = new LinkedList<Dosen>();
		dosen.add(antik);
		dosen.add(cahya);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Tutor Info");
		System.out.println("2. Back to main menu");
		System.out.println("3. Exit Application");
		System.out.println("Input 1-3: ");
		int inputInt = scanner.nextInt();
		scanner.nextLine();
		
		switch(inputInt)
		{
		case 1:
			//show dosen by ID and Full Name
			for(Dosen tutor : dosen)
			{
				System.out.printf("NIK: %s, Name: %s %s\n",tutor.getDosenID(),tutor.firstName,tutor.lastName);
			}
			//Type in dosen id
			System.out.println("Input tutor ID for tutor info you want to find out: ");
			String inputCode = scanner.nextLine();
			
			for(Dosen tutorAgain : dosen)
			{
				if(inputCode == tutorAgain.getDosenID())
				{
					tutorAgain.printSummary();
				}
				else
				{
					System.out.println("Dosen tidak ditemukan");
				}
			}
			//check inputCode == studentID.
			//print student detail of inputCode
			
			break;
		case 2:
			MainProgram.main(null);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Please input 1-3 only: ");
		}
	}
}
