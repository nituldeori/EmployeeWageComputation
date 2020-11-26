package employeeWage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilderArray implements IComputeEmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private int numOfCompany=0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	public EmpWageBuilderArray() {
		companyEmpWageList=new LinkedList<>();
		companyToEmpWageMap=new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	
	public void computeEmpWage() {
		for(int i=0;i<companyEmpWageList.size();i++) {
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	
	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		
		while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth &&
				totalWorkingDays<companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			    case IS_PART_TIME:
			    	empHrs=4;
			    	companyEmpWage.dailyEmpWage.add(empHrs*companyEmpWage.empRatePerHour);
			    	
			    	break;
			    case IS_FULL_TIME:
			    	empHrs=8;
			    	companyEmpWage.dailyEmpWage.add(empHrs*companyEmpWage.empRatePerHour);
			    	
			    	break;
			    default:
			    	empHrs=0;
			    	companyEmpWage.dailyEmpWage.add(empHrs*companyEmpWage.empRatePerHour);
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
			System.out.println("Day#: "+totalWorkingDays+" wage "+empHrs*companyEmpWage.empRatePerHour);
		}
		return totalEmpHrs*companyEmpWage.empRatePerHour;
		
	}
	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Wage for DMart Company: "+empWageBuilder.getTotalWage("DMart"));
	}

}
