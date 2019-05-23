import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Biodata rempong = new Biodata("Remi", "Pongga", LocalDate.of(1995, Month.DECEMBER, 5),"Bandung",
									  Gender.MALE, "312858234011989002", Religion.CATHOLIC,BloodType.B);
		
		rempong.printSummary();
	}

}
