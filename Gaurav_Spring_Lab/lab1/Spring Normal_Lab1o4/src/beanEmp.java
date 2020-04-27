/*
 * Dependency Injection
 *  
 * */
public class beanEmp {

	private int eid       ;
	private String ename  ; 
	private String bu     ;
	private int sal       ;
	private int age       ;
	private beanSBU businessUnit ;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getAge() {
		return eid;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public beanSBU getSBUDetails()
	{
	  return businessUnit;	
	}
	
	public void setSBUDetails(beanSBU b)
	{
	  businessUnit = b ;	
	}
	
	
}
