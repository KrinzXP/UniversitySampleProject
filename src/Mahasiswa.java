import java.util.*;
import java.math.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.*;

public class Mahasiswa extends Biodata{
	private String studentID;
	LocalDate entryDate;
	private LinkedList<String>mataKuliah;
	
	public String getStudentID()
	{
		return this.studentID;
	}
	public void setStudentID()
	{
		this.studentID = studentID;
	}
	
	public LocalDate getEntryDate()
	{
		return entryDate;
	}	
	public void setEntryDate()
	{
		this.entryDate = entryDate;
	}
	
	public LinkedList<String> getMataKuliah()
	{
		return mataKuliah;
	}
	public void setMataKuliah(LinkedList<String> mataKuliah)
	{
		this.mataKuliah = mataKuliah;
	}
	
	public Mahasiswa(String firstName, String lastName, LocalDate birthDate, String birthPlace, Gender gender,
			String nationalID, Religion religion, BloodType bloodType, String studentID, LocalDate entryDate,
			LinkedList<String>mataKuliah) {
		super(firstName, lastName, birthDate, birthPlace, gender, nationalID, religion, bloodType);
		this.studentID = studentID;
		this.entryDate = entryDate;
		this.mataKuliah = new LinkedList<String>();
		
	}
	
	@Override
	public void printSummary()
	{
		LocalDate now = LocalDate.now();
		long yearDifference = ChronoUnit.YEARS.between(this.entryDate, now);
		long monthDifference = ChronoUnit.MONTHS.between(this.entryDate, now);
		long dayDifference = ChronoUnit.DAYS.between(this.entryDate, now);
		
		System.out.printf("First Name: %s\nLast Name: %s\n"
						+ "Gender: %s\nBirth Information: %s, %s(%d tahun)\n"
						+ "Religion: %s\nBloodType: %s\nID Card: %s\n"
						+ "Entry Date: %s (%d years, %d months, %d days)\n",
				this.firstName, this.lastName, this.gender, this.birthPlace, this.birthDate,
				getAge(),this.religion, this.bloodType, this.nationalID,this.entryDate,
				yearDifference, monthDifference, dayDifference);

	}
	
}
	
	

