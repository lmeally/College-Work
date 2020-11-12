package week5.lab4;

import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class MyHr {
				
				public void main(String args[])
				{
					Office[] rooms = new Office[3];
					Employee[] workers = new Employee[5];
					System.out.println("1 - List Offices");
					System.out.println("2 - Create New Employee");
					System.out.println("3 - List Employees");
					System.out.println("4 - EXIT");
					Scanner input = new Scanner(System.in);
					System.out.println("\nEnter \"1\", \"2\" or \"3\"");
					int choiceentry = input.nextInt();
					
					for(int x = 0;x <= 2;x++)
					{
						Office of = new Office();
						rooms[x]=of;
					}
					
					while (choiceentry != 4) 
					{
					    System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");    
					    choiceentry = input.nextInt();
					    
					    if(choiceentry == 1) 
					    {
					    	for(Office of:rooms)
					    	{
					    		System.out.println(of.toString());
					    		if(of.getEmpCount() != 0)
					    		{
					    			System.out.println("Employee: "+ "\n" + of.displayWorkers());
					    		}
					    	}
					    }
					    else if(choiceentry == 2) 
					    {

					    }
					    else if(choiceentry == 3) 
					    {
					    	for(Employee workers1:workers)
					    	{
					    		if(workers1 != null)
					    		{
					    			System.out.println("4 - EXIT");
					    		}
					    	}
					    }
				
					}   
				}

		}
		
	}

}
