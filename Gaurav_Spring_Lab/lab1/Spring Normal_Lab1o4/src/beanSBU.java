import java.util.List;

public class beanSBU {

	
	private int    sid  ;
	private String name ;
	private String head ;
	private List<beanEmp> empList; 
	
	public void setBeanEmpList(beanEmp b)
	{
		empList.add(b);
	}
	public List<beanEmp> getBeanEmpList()
	{
		return empList;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	
	
}
