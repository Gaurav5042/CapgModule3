package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bean.Author;

public class Services {

	static EntityManagerFactory e_fac = Persistence.createEntityManagerFactory("AuthorProj");
	static EntityManager e_mngr = e_fac.createEntityManager();

	public static void main(String[] args)
	{
		Services service= new Services();
		
		Author authorObj = new Author();
		authorObj.setAuthorId(158);
		authorObj.setFirstName("Gaurav ");
		authorObj.setPhoneNo(68352419);
		authorObj.setMiddleName("Chand");
		authorObj.setLastName("Singh");
		
		service.InsertIntoAuthorDB(authorObj);
		
		Author authorObj1 = new Author();
		authorObj1.setAuthorId(246);
		
		authorObj1.setFirstName("Garv");
		authorObj1.setMiddleName(" ");
		authorObj1.setLastName("Singh");
		authorObj1.setPhoneNo(9825486);
		service.InsertIntoAuthorDB(authorObj1);
		
		Author a=service.GetAuthorDetails(158);
		
		System.out.println("Author id is:"+a.getAuthorId());
		System.out.println("Author name is:"+a.getName());
		System.out.println("Author phone no is:"+a.getPhoneNo());
		System.out.println();
		
		Author a2=service.GetAuthorDetails(246);
		
		System.out.println("author details");
		System.out.println("Author id is:"+a2.getAuthorId());
		System.out.println("Author name is:"+a2.getName());
		System.out.println("Author phone no is:"+a2.getPhoneNo());
		
		System.out.println();
		
		service.UpdateAuthor(202, 954525486);
		Author a1=service.GetAuthorDetails(202);
		System.out.println("Author id is:"+a1.getAuthorId());
		System.out.println("Author name is:"+a1.getName());
		System.out.println("Author phone no is:"+a1.getPhoneNo());
		service.DeleteAuthor(202);
	
	}
	
	public void InsertIntoAuthorDB(Author authorObj) {
		e_mngr.getTransaction().begin();
		
		e_mngr.persist(authorObj);
		e_mngr.getTransaction().commit();
		System.out.println("Author inserted successfully");
	}
	public void UpdateAuthor(int id,long phone) {
		e_mngr.getTransaction().begin();
		Author author = e_mngr.find(Author.class, id);
		author.setPhoneNo(phone);
		e_mngr.getTransaction().commit();
		System.out.println("Author phone no updated successfully");
	}
	Author GetAuthorDetails(int id) {
		Author author = e_mngr.find(Author.class, id);
		return author;
	}
	public void DeleteAuthor(int id) {
		e_mngr.getTransaction().begin();
		Author author = e_mngr.find(Author.class, id);
		e_mngr.remove(author);
		e_mngr.getTransaction().commit();
		System.out.println("Author deleted successfully");
	}
	
}