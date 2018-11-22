
public class Empmain {

	public static void main(String[] args) {
		Emp em[]=new Emp[5];
	//	String emp1[]=new String[5];
		    em[0]=new Emp(101,"vaish","manager",20000.0);
			em[1]=new Emp(102,"vidhya","officer",18000.0);
			em[2]=new Emp(103,"ashvi","manager",22000.0);
			em[3]=new Emp(104,"kavi","officer",17000.0);
			em[4]=new Emp(105,"harini","clerk",15000.0);
			System.out.println("-------Employee details------");
			for(int i=0;i<em.length;i++)
			{
				em[i].hra=Emp.CalculateHRA(em[i].basic,em[i].designation);
				em[i].PrintDet();
				em[i].salary=em[i].hra+em[i].basic;
			}
			
			/*for(int i=0;i<em.length;i++)
				emp1[i]=em[i].getDesignation();
			Emp.EmployeeByDesg(emp1,em);*/
			System.out.println("-------Employee by salary------");
			for(int i=0;i<em.length;i++)
			{
				Emp.EmpDet(em[i].ename, em[i].salary);
			}
			System.out.println("-------Employee by designation------");
			for(int i=0;i<em.length;i++)
			{
				Emp.EmpDet(em[i].ename, em[i].designation);
			}
			
			
			
	}

	


}
