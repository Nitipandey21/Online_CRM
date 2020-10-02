 package com.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
	
	
           @Id

		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;

		
		
		public Customer()
		{}

		@Column(name="fname")
		private String fname;
		
		@Column(name="lname")
		private String lname;
		
		@Column(name="email")
		private String mail;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mail=" + mail + "]";
		}
		
		
		
}
