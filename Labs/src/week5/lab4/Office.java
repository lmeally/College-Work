package week5.lab4;

public class Office {
//test
		private int roomNumber;
		static int counter = 100;
		private int empCount;
		
		private Employee[] workers = new Employee[5];
		
		public Office()
		{
			super();
			setRoomNumber(counter);
			counter++;
		}

		public int getEmpCount() 
		{
			return empCount;
		}

		public void setEmpCount(int empCount) 
		{
			this.empCount = empCount;
		}

		public void createEmployee(Employee worker)
		{
			if(empCount <= 2)
			{
				this.workers[empCount]=worker;
				empCount++;
			}
			else
			{
				System.out.println("You have reached the maximum amount of Employees!");
			}
		}
		
		public String displayWorkers()
		{
			String workerDetails="";
			for(Employee worker:workers)
			{
				if(workers != null)
				{
					workerDetails += worker.getEmptype() + "," + ((Employee) worker).getFname()+","+worker.getLname() +"\n";
				}
			}
			return workerDetails;
		}
		
		public void setRoomNumber(int counter)
		{	
			int roomNumber = counter;
		}
		
		@Override
		public String toString() 
		{
			return "Office [roomNumber=" + roomNumber + ", empCount=" + empCount + "]";
		}
		
	}

