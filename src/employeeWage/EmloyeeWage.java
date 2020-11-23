package employeeWage;

public class EmloyeeWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static int computeEmpWage() {
        System.out.println("Welcome to Employee Wage Computation");
		
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
			
			
			switch(empCheck) {
			    case IS_PART_TIME:
				    empHrs=4;
				    break;
			    case IS_FULL_TIME:
				    empHrs=8;
				    break;
			    default:
				    empHrs=0;
			}
			totalEmpHrs+=empHrs;
			totalWorkingDays++;
		}
		System.out.println("Working Days: "+totalWorkingDays+" Emp Hrs: "+totalEmpHrs);
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: "+totalEmpWage);
		return totalEmpWage;
		
	}
	public static void main(String[] args) {
		computeEmpWage();
	}
		

}
