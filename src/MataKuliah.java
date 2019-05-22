
public enum MataKuliah {
	//initialize enum objects
	OOP("Object Oriented Programming", "Programming", 20),
	DS("Data Structure", "Programming", 30),
	NF("Networking Fundamentals","Networking",20),
	DF("Database Fundamental","Programming",30),
	PMP("Project Management Professional","Management and Analysis",40),
	UML("Unified Modelling Language","Management and Analysis",20),
	JF("Java Fundamental","Programming",30),
	ID("Infrastructure Design","Networking",30),
	NS("Network and Security","Networking",20);

	
	//create constructors
	private final String fullName;
	private final String type;
	private final int points;
	
	private MataKuliah(String fullName, String type, int points)
	{
		this.fullName = fullName;
		this.type = type;
		this.points = points;
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	
	public String getType()
	{
		return type;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	
	
}
