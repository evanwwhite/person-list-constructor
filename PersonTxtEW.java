
public class PersonTxtEW {

		private String firstName, lastName, idNum;
		private int age;
		private int grade;
		private double gpa;
		private double wage;
		private double hoursWorked;
		private double salary;

	  //=========================================================

		PersonTxtEW()			            // Constructor (default)
		{
			firstName = "";
			lastName = "";
			idNum = "";
			age = 0;
		}

		PersonTxtEW(String f, String l, String i, int a)  // Constructor (parameterized)
		{
			firstName = f;
			lastName = l;
			idNum = i;
			age = a;
		}

		PersonTxtEW(String f, String l, String i, int a, int g, double gp)  // Constructor (parameterized)
		{
			firstName = f;
			lastName = l;
			idNum = i;
			age = a;
			grade = g;
			gpa = gp;
		}
		PersonTxtEW(String f, String l, String i, int a, double w, double hrs)  // Constructor (parameterized)
		{
			firstName = f;
			lastName = l;
			idNum = i;
			age = a;
			wage = w;
			hoursWorked = hrs;
			salary = wage * hoursWorked;
		}
	  //=========================================================

		public String getFirstName()    // accessor "getter" methods
		{
			return firstName;
		}

		public String getLastName()
		{
			return lastName;
		}

		public String getIdNum()
		{
			return idNum;
		}

		public int getAge()
		{
			return age;
		}
		
		public int getGrade()
		{
			return grade;
		}
		
		public double getGPA()
		{
			return gpa;
		}
		
		public double getWage()
		{
			return wage;
		}
		
		public double getHoursWorked()
		{
			return hoursWorked;
		}
		
		public double getSalary()
		{
			return salary;
		}
		
	  //=========================================================

		public void setFirstName(String n)                // mutator "setter" methods
		{
			firstName = n;
		}
		public void setLastName(String n)
		{
			lastName = n;
		}
		public void setIdNum(String s)
		{
			idNum = s;
		}
		public void setAge(int a)
		{
			age = a;
		}
		public void setGrade(int g)
		{
			grade = g;
		}
		public void setGPA(double g)
		{
			gpa = g;
		}
		public void setWage(double w)
		{
			wage = w;
			salary = wage * hoursWorked;
		}
		public void setHoursWorked(double hrs)
		{
			hoursWorked = hrs;
			salary = wage * hoursWorked;
		}
		public void setSalary(double s)
		{
			salary = s;
		}
	}