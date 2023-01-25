package com.prince.spring.propertyinjection.xmlbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/prince/spring/propertyinjection/xmlbean/config.xml");
		Student st= (Student) ctx.getBean("student2");
		System.out.println(st.getId()+" "+st.getName());

	}

}
