package com.prince.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/prince/spring/lifecycle/config.xml");
		Student st= (Student) ctx.getBean("Student");
		System.out.println(st.getId()+" "+st.getName());
		
		//it enable pre destroy hook on the object
		((AbstractApplicationContext)ctx).registerShutdownHook();

	}

}
