package employeeWage;
import java.util.ArrayList;
public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public ArrayList<Integer> dailyEmpWage=new ArrayList<Integer>();
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	
	public void printDailyEmpWage() {
		for(int i=0;i<dailyEmpWage.size();i++) {
			System.out.println("Day: "+i+1+" wage: "+dailyEmpWage.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is: "+totalEmpWage;
	}

}
