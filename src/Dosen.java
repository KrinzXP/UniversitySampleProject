import java.util.*;
import java.math.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.*;

public class Dosen extends Biodata{
	private String dosenID;
	private BigDecimal salary;
	private LocalDate entryDate;
	private LinkedList<String>mataKuliah;
	
	public String getDosenID()
	{
		return this.dosenID;
	}
	public void setDosenID(String dosenID)
	{
		this.dosenID = dosenID;
	}
	
	public BigDecimal getSalary(BigDecimal salary)
	{
		return this.salary;
	}
	public void setSalary()
	{
		this.salary = salary;
	}
	
	public LocalDate getEntryDate()
	{
		return this.entryDate;
	}
	public void setEntryDate(LocalDate entryDate)
	{
		this.entryDate = entryDate;
	}
	
	public LinkedList<String> getMataKuliah()
	{
		return mataKuliah;
	}
	public void setMataKuliah(LinkedList<String>mataKuliah)
	{
		this.mataKuliah = mataKuliah;
	}
	
	
	
	
	public Dosen(String firstName, String lastName, LocalDate birthDate, String birthPlace, Gender gender,
			String nationalID, Religion religion, BloodType bloodType,
			String dosenID, BigDecimal salary, LinkedList<String> mataKuliah) {
		super(firstName, lastName, birthDate, birthPlace, gender, nationalID, religion, bloodType);
		
		this.dosenID = dosenID;
		this.salary = salary;
		this.mataKuliah = mataKuliah;
	}
	
	@Override
	public void printSummary()
	{
		//TODO find time difference properly
		LocalDate now = LocalDate.now();
		long yearDifference = ChronoUnit.YEARS.between(this.entryDate, now);
		long monthDifference = ChronoUnit.MONTHS.between(this.entryDate, now);
		long dayDifference = ChronoUnit.DAYS.between(this.entryDate, now);
		
		System.out.printf("First Name: %s\nLast Name: %s\n"
						+ "Gender: %s\nBirth Information: %s, %s(%d tahun)\nReligion: %s\n"
						+ "BloodType: %s\nID Card: %s\n"
						+ "Hire Date(Duration): %s (%d years, %d months, %d days)",
				this.firstName, this.lastName, this.gender, this.birthPlace, this.birthDate,
				getAge(),this.religion, this.bloodType, this.nationalID, this.entryDate,
				yearDifference, monthDifference, dayDifference);

	}
	
	public void printCompetencyInfo()
	{
		System.out.println("Competency Information: ");
		for(String matKul : this.mataKuliah)
		{
			System.out.println(matKul);
		}
	}
	
}
