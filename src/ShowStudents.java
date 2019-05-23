import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
public class ShowStudents {

	public static void studentInfo() {
		// TODO grab list of students and print into 

		
		Scanner scanner = new Scanner(System.in);
		
		//data
		LinkedList<String>pelajaranAlex = new LinkedList<String>();
		pelajaranAlex.add(MataKuliah.OOP.getFullName());
		pelajaranAlex.add(MataKuliah.DS.getFullName());
		
		LinkedList<String>pelajaranDesy = new LinkedList<String>();
		pelajaranDesy.add(MataKuliah.NF.getFullName());
		pelajaranDesy.add(MataKuliah.DS.getFullName());
		
		LinkedList<String>pelajaranJoko = new LinkedList<String>();
		pelajaranJoko.add(MataKuliah.UML.getFullName());
		
		LinkedList<Mahasiswa> mahasiswa = new LinkedList<Mahasiswa>();  
		
		Mahasiswa alex = new Mahasiswa("Alex","Wirianata",LocalDate.of(1990, Month.NOVEMBER, 23),
				"Jakarta",Gender.MALE,"312008923111990002",Religion.CHRISTIAN,BloodType.A,
				"A021",LocalDate.of(2018, Month.APRIL, 12),pelajaranAlex);
		
		Mahasiswa desy = new Mahasiswa("Desy", "Oktaviani",LocalDate.of(1995, Month.MAY, 11),
				"Bandung",Gender.FEMALE,"312008911051995002",Religion.MUSLIM,BloodType.O,
				"A022",LocalDate.of(2018, Month.APRIL, 1),pelajaranDesy);
		
		Mahasiswa joko = new Mahasiswa("Joko", "Davidson",LocalDate.of(1995, Month.JUNE, 7),
				"Jakarta",Gender.MALE,"312008923111990002",Religion.MUSLIM,BloodType.A,
				"A033",LocalDate.of(2018, Month.APRIL, 14),pelajaranJoko);
		
		mahasiswa.add(desy);
		mahasiswa.add(alex);
		mahasiswa.add(joko);
		
		//menu
		System.out.println("1. Student Info");
		System.out.println("2. Back to main menu");
		System.out.println("3. Exit Application");
		System.out.println("Input: ");
		int inputInt = scanner.nextInt();
		scanner.nextLine();
		
		switch(inputInt)
		{
		case 1:
			for(Mahasiswa siswa : mahasiswa)
			{
				System.out.printf("NIK: %s, Name: %s %s\n",siswa.getStudentID(),siswa.firstName,siswa.lastName);
			}
			//Type in student id
			System.out.println("Input student ID for student info you want to find out: ");
			String inputCode = scanner.nextLine();
			//Mahasiswa.printSummary();
			for(Mahasiswa mahasiswaAgain : mahasiswa)
			{
				if(inputCode == mahasiswaAgain.getStudentID())
				{
					mahasiswaAgain.printSummary();
				}
				else
				{
					System.out.println("Dosen tidak ditemukan");
				}
			}
			break;
		case 2:
			MainProgram.main(null);
			break;
		case 3:
			System.exit(0);
			break;
		}
	}

}
