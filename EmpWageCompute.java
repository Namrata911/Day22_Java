public class EmpWageCompute{

public static void main(String[] args){
	System.out.println("Welcome");
	int isFullTime = 1;

		int empCheck = (int)Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if(empCheck == isFullTime)
		{
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}

	int wagePerHr=20;
	int fulldayHour=8;
	int dailyWage=wagePerHr*fulldayHour;
	System.out.println("Daily full time employee wage is "+dailyWage);
}

}
