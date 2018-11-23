package ListExample;
public class Employee implements Comparable<Employee>{
	static int choice;
		int eid;
		String ename;
		String desg;
		
		public Employee() {
			super();
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		
		public void setChoice(int choice) {
			this.choice = choice;
		}
		
		public int getChoice() {
			return choice;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + "]";
		}
		@Override
		public int compareTo(Employee arg0) {
			if(getChoice()==1)
			{
				System.out.println(getChoice());
				
				return this.eid-arg0.getEid();
			}
			else if(getChoice()==2)
				return this.ename.compareTo(arg0.getEname());
			else
			{
				System.out.println("----"+getChoice());
				return this.desg.compareTo(arg0.getDesg());
			}
				
			
		}
		
}
