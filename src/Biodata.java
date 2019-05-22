import java.util.*;
import java.math.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.*;

public class Biodata {
	protected String firstName;
	protected String lastName;
	protected LocalDate birthDate;
	protected String birthPlace;
	protected Gender gender;
	protected String nationalID;
	protected Religion religion; //Asumsi 5 tipe agama (enum Religion)
	protected BloodType bloodType;
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}

	public String getBirthPlace()
	{
		return this.birthPlace;
	}
	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}

	public Gender getGender()
	{
		return this.gender;
	}
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}


	public String getNationalID()
	{
		return this.nationalID;
	}
	public void setNationalID(String nationalID)
	{
		this.nationalID = nationalID;
	}
	
	public Religion getReligion()
	{
		return this.religion;
	}
	public void setReligion(Religion religion)
	{
		this.religion = religion;
	}
	
	public BloodType getBloodType()
	{
		return this.bloodType;
	}
	public void setBloodType(BloodType bloodType)
	{
		this.bloodType = bloodType;
	}

	public Biodata(String firstName, String lastName, LocalDate birthDate, String birthPlace,
				   Gender gender, String nationalID, Religion religion, BloodType bloodType)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.nationalID = nationalID;
		this.religion = religion;
		this.bloodType = bloodType;
	}
	
	
	public long getAge()
	{
		LocalDate now = LocalDate.now();
		long age = ChronoUnit.YEARS.between(birthDate, now);
		return age;
	}
	
	public void printSummary()
	{
		System.out.printf("First Name: %s\nLast Name: %s\n"
						+ "Gender: %s\nBirth Information: %s, %s(%d tahun)\n"
						+ "Religion: %s\nBloodType: %s\nID Card: %s\n",
							this.firstName, this.lastName, this.gender, this.birthPlace, this.birthDate,
							getAge(),this.religion, this.bloodType, this.nationalID);
	}
	
}
