package Curs9Tema;

public class Qualification extends Teacher{
	public String CourseName;
	public int experienceYears;
	public String Schedule;
	
	public Qualification(String course, int experienceYears, String schedule) {
		this.CourseName = course;
		this.experienceYears = experienceYears;
		this.Schedule = schedule;
	}
	

	public Qualification() {
		// TODO Auto-generated constructor stub
	}


	public void Verify() {
		if (experienceYears>3 && CourseName.equals("Java") && Schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
}

}