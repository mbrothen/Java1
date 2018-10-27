
public class TestJobApplicants {

	public static void main(String[] args) {
		JobApplicant matt = new JobApplicant("Matt", "(262)412-0030", true, false, true, true);
	qualification(matt);
	JobApplicant tom = new JobApplicant("Tom", "(262)412-0030", true, false, true, false);
	qualification(tom);
	JobApplicant tim = new JobApplicant("Tim", "(262)412-0030", false, false, true, true);
	qualification(tim);
	JobApplicant mike = new JobApplicant("Mike", "(262)412-0030", true, true, true, true);
	qualification(mike);

}
	//My reading of the question made this seem like displaying if their qualified should be in main(), this seems like it would be more natural in JobApplicant, the end result is the same its' just called different, qualifaction(job applicant) vs jobapplicant.qualification()
	public static void qualification(JobApplicant ja) {
		if (ja.interview() == true)
			System.out.println(ja.getName() + " is qualified for an interview. \n" );
		else
			System.out.println(ja.getName() + " does not have the required skills for an interview\n");
	}
}
