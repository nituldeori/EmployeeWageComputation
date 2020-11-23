package employeeWage;

public class EmloyeeWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static int computeEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
        System.out.println("Welcome to Employee Wage Computation");
		
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=maxHoursPerMonth&& totalWorkingDays<numOfWorkingDays) {
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			
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
			System.out.println("Day#"+totalWorkingDays+" Emp Hr: "+empHrs);
		}
		System.out.println("Working Days: "+totalWorkingDays+" Emp Hrs: "+totalEmpHrs);
		int totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total Emp Wage for Company "+company+" is: "+totalEmpWage);
		return totalEmpWage;
		
	}
	public static void main(String[] args) {
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("Reliance",10,4,20);
	}
		

}
