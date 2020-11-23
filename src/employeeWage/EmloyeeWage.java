package employeeWage;

public class EmloyeeWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	public EmloyeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void computeEmpWage() {
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
		totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total Emp Wage for Company "+company+" is: "+totalEmpWage);
		
	}
	public static void main(String[] args) {
		EmloyeeWage dmart=new EmloyeeWage("DMart",20,2,10);
		EmloyeeWage reliance=new EmloyeeWage("Reliance",10,4,20);
		dmart.computeEmpWage();
		reliance.computeEmpWage();
	}
		

}
