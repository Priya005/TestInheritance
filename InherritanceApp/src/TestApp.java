
public class TestApp {

	public static void main(String[] args) {
		
		Maneger m1=new Maneger(101,"priya",500,200);
		Maneger m2=new Maneger(101,"priya",500,200);
		
		System.out.println("----------------------------");
		if(m1.equals(m2)){
			System.out.println("Obj are Same");
		}
		else{
			System.out.println(" Obj are Not Same");
		}
		System.out.println("-----------------------------------");
		
		display(m1,"Maneger");
		Devloper d1=new Devloper(102,"piuu",500,20);
		display(d1,"Devloper");
		Tester t1=new Tester(103,"piuu",500,9);
		display(d1,"Tester");
		
		
		
	}	
		private static void display(Employee e, String string) 
		{
			System.out.println(e);
			System.out.println("--------------------------");
		}
}
		/*
		{
			// TODO Auto-generated method stub
			System.out.println(string+"Id:"+e.getEmpId());
			System.out.println(string+"Name:"+e.getEmpName());
			System.out.println(string+"Salory"+e.getEmpSalory());
			if(e instanceof Maneger){
				Maneger m1=(Maneger)e;
				System.out.println("Maneger Bonus:"+m1.getBonus());
				
			}
			if(e instanceof Devloper){
				Devloper d1=(Devloper)e;
				System.out.println("Maneger Bonus:"+d1.getNofHrs());
				
			}
			if(e instanceof Tester){
				Tester t1=(Tester)e;
				System.out.println("No of TestCases :"+t1.NofTestcases());
				
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Maneger m1=new Maneger(101,"priya",500,200);
		System.out.println("Manager Id:"+m1.getEmpId());
		System.out.println("Manager Name:"+m1.getEmpName());
		System.out.println("Manager Salory:"+m1.getEmpSalory());
		System.out.println("Manager Bonus:"+m1.getBonus());
		System.out.println("--------------------------------");
		
		Devloper d1=new Devloper(102,"piuu",500,20);
		System.out.println("Devloper Id:"+d1.getEmpId());
		System.out.println("Devloper Name:"+d1.getEmpName());
		System.out.println("Devloper Salory:"+d1.getEmpSalory());
		System.out.println("Devloper Bonus:"+d1.getNofHrs());
		System.out.println("---------------------------------");
		Tester t1 =new Tester(103,"jiya",3000,3);
		System.out.println("Tester Id:"+t1.getEmpId());
		System.out.println("Tester Name:"+t1.getEmpName());
		System.out.println("Tester Salory:"+t1.getEmpSalory());
		System.out.println("No of Testcases:"+t1.getNofTestcases());
		*/
	
	

	
	


