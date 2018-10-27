
public class JobApplicant {
	private final int NUM_SKILLS = 3;
	private static int totalSkills = 0;
	private String name;
	private String phone;
	private boolean wordProcessing;
	private boolean spreadsheets;
	private boolean databases;
	private boolean interview;
	private boolean graphics;
public JobApplicant(String name, String phone,  boolean wordProcessing, boolean spreadsheets, boolean databases, boolean graphics) {
	this.name = name;
	this.phone = phone;
	this.wordProcessing = wordProcessing;
	this.spreadsheets = spreadsheets;
	this.databases = databases;
	this.graphics = graphics;
}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public int getSkills() {
		return totalSkills;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isWordProcessing() {
		return wordProcessing;
	}
	public void setWordProcessing(boolean wordProcessing) {
		this.wordProcessing = wordProcessing;
	}
	public boolean isSpreadsheets() {
		return spreadsheets;
	}
	public void setSpreadsheets(boolean spreadsheets) {
		this.spreadsheets = spreadsheets;
	}
	public boolean isDatabases() {
		return databases;
	}
	public void setDatabases(boolean databases) {
		this.databases = databases;
	}
	public boolean isGraphics() {
		return graphics;
	}
	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	};
	
	public void test()
	{
		if(interview)
			System.out.println(name + " has " + totalSkills + " of 4 required skills.  " + name + " gets an interview\n");
		else
			System.out.println(name + "does not meet the requirements for an interview, they only have " + totalSkills + " of the 3 minimum");
		
	}
	public boolean interview() {
		totalSkills = 0;
		totalSkills = wordProcessing ? totalSkills + 1 : totalSkills + 0;
		totalSkills = spreadsheets ? totalSkills +1 : totalSkills+0;
		totalSkills = databases ? totalSkills +1 : totalSkills+0;
		totalSkills = graphics ? totalSkills +1 : totalSkills+0;
		if (totalSkills>=NUM_SKILLS)
			interview = true;
		else 
			interview = false;

		return interview;
	}
}
