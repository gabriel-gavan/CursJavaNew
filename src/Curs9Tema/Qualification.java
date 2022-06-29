package Curs9Tema;

public class Qualification extends Teacher{
	/*public String CourseName;
	public int experienceYears;
	public String Schedule;
	*/
	public Qualification(String course, int experience, String schedule) {
	      super(course, experience, schedule);
	}
	



	public void Verify() {
		if (experienceYears>3 && course.equalsIgnoreCase("Java") && schedule.equalsIgnoreCase("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
}

}