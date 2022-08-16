package com;

public class EmployeeSalary {
	String name ;
	int id ;
	int level ;
	int basicPay;
	int boa;
	int bonus;
	int afterPF;
	int taxRate;
	int takeHomeSalary;
	int percentageOfPF ;
	int taxableSalary;
	
	
	public EmployeeSalary()
	
	{
		percentageOfPF = 12;
	}
	
	
	private int calculateTakeHomeSalary(EmployeeSalary e1) {

		this.level = e1.level;
		
		switch(level)
		
		{
		case 1:
			this.basicPay = 7000;
			this.boa = 5000;
			this.bonus = 2000;
			this.afterPF = calAfterPF(basicPay);
			
			this.taxableSalary =  calTaxableSalary();
			
			break;
			
		case 2:
			this.basicPay = 10000;
			this.boa = 7000;
			this.bonus = 2500;
			this.afterPF = calAfterPF(basicPay);
			
			this.taxableSalary =  calTaxableSalary();
			
			break;
			
		case 3 :
			
			this.basicPay = 12000;
			this.boa = 9000;
			this.bonus = 3000;
			this.afterPF = calAfterPF(basicPay);
			
			this.taxableSalary =  calTaxableSalary();
			
			break;
			
		case 4 :
			
			this.basicPay = 15000;
			this.boa = 10000;
			this.bonus = 3500;
			this.afterPF = calAfterPF(basicPay);
			
			this.taxableSalary =  calTaxableSalary();
			
			break;
			
		
		}
		
		if(taxableSalary<=250000) taxRate = 0;
		if((250000<taxableSalary)&&(taxableSalary<=500000)) taxRate = 5;
		if((500000<taxableSalary)&&(taxableSalary<=750000)) taxRate = 10;
		if((750000<taxableSalary)&&(taxableSalary<=1000000)) taxRate = 20;
		if((1000000<taxableSalary)&&(taxableSalary<=1250000)) taxRate = 30;
		if((1250000<taxableSalary)&&(taxableSalary<=1300000)) taxRate = 30;
		if(taxableSalary>1300000) taxRate = 30;


		takeHomeSalary = 	taxableSalary - (taxableSalary * taxRate )/100;
		
		
		return takeHomeSalary/12;
	}
	
	
	
	private int calTaxableSalary() {
		// TODO Auto-generated method stub
		return (basicPay +boa + bonus - afterPF)*12;
	}


	public int calAfterPF (int bp)
	
	{
		return (percentageOfPF * basicPay)/100;
		
	}
	
	
	
	public static void main(String[] args) {
	
		EmployeeSalary e1 = new EmployeeSalary();
		
		e1.name = " Anu";
		e1.id = 001;
		e1.level = 2;
		
		
		int takeHomesalary = e1.calculateTakeHomeSalary(e1);
		
		 
		System.out.println(takeHomesalary);
	}

	

}
