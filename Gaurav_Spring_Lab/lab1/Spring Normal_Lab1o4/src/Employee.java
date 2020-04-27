import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	/* DI */
	
	public static void main(String[] args) {
		
		System.out.println("gaurav chand singh");
		
		ApplicationContext ct = new ClassPathXmlApplicationContext("EmpBean.xml");
		
		
		beanEmp emp1 =(beanEmp) ct.getBean("helloEmp");
		beanEmp emp2 =(beanEmp) ct.getBean("helloEmp1");
		
		beanSBU obj1 =(beanSBU) ct.getBean("helloBu");
		
		obj1.setBeanEmpList(emp1);
		obj1.setBeanEmpList(emp2);
		
		
		
		/*
		System.out.print("\n\n\n Employee  [ ID -> "+obj.getEid());
		System.out.print(", Name -> "+obj.getEname());
		System.out.print(", Age  -> "+obj.getAge());
		System.out.println(", Sal  -> "+obj.getSal()+" ]\n");*/
		
		System.out.println("SBU Details");
		System.out.print(" SBU Details  [ ID ->"+obj1.getSid());
		System.out.print(", Head -> "+obj1.getHead());
		System.out.print(", Name  -> "+obj1.getName()+" ]");
		System.out.println("Employee under Business Unit");
		
		/*
		beanEmp eobj =(beanEmp) ct.getBean("helloEmp");
		
		eobj.setEid(54);
		eobj.setSal(2056348);
	    */
		
		
		/*
		System.out.println("/////Old ///////");
		
		System.out.println("Id   -> "+obj.getEid());
		System.out.println("Name -> "+obj.getEname());
		System.out.println("Dept -> "+obj.getDept());
		System.out.println("Sal  -> "+obj.getSal());
		
		System.out.println(" \n When not overrided then previous value is printed \n");
		
		System.out.println("Id   -> "+obj.getEid());
		System.out.println("Name -> "+obj.getEname());
		System.out.println("Dept -> "+obj.getDept());
		System.out.println("Sal  -> "+obj.getSal());
         */
	}

}
