package employeeWage;

public class EmloyeeWage {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	public static final int emp_rate_per_hour=20;
	public static final int num_of_working_days=20;
	public static final int max_hrs_in_month=100;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		while(totalEmpHrs<=max_hrs_in_month && totalWorkingDays<num_of_working_days) {
			
			
			switch(empCheck) {
			case is_part_time:
				empHrs=4;
				break;
			case is_full_time:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			totalWorkingDays++;
		}
		System.out.println("Working Days: "+totalWorkingDays+" Emp Hrs: "+totalEmpHrs);
		int totalEmpWage=totalEmpHrs*emp_rate_per_hour;
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}

}
