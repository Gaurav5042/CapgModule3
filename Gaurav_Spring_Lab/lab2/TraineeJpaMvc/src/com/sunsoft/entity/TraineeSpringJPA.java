package com.sunsoft.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.SequenceGenerator;
	import javax.persistence.Table;

	@Entity
	@Table(name="TraineeSpringJPA")
public class TraineeSpringJPA {

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
		@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
		private int id;
		
		@Column(name = "name")
		String name;
		
		@Column(name = "dept")
		String dept;
		
		@Column(name = "sal")
		int sal;
		
		public TraineeSpringJPA(){}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String domain) {
			this.dept = domain;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Trainee [id = " + id + ", Name = " + ", department = " + dept + ", salary = " + sal + " ]";
		}
				
}


