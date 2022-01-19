package com.zee.zee5_app;
import java.util.Iterator;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.service.SeriesService;
import com.zee.zee5_app.service.UserService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Register register = new Register();
		//Register : class name
				// register : reference which will refer your object
				// new : is used to create the object 
				// Register() : constructor ===> DC ==> IDC
		
		Series series = new Series();
		Movie movie=new Movie();
		
		

		register.setFirstName("abhi");
		register.setLastName("chivate");
		register.setEmail("abhi@gmail.com");
		register.setPassword("abhi1234");
		
		
		series.setCat("Adult");
		series.setId("11221");
		series.setLang("hindi");
		series.setLen(147);

		System.out.println(series);
		// whenever you will print the reference then it 
		// will call toString() method.

		//System.out.println(register.toString());

		//System.out.println(register.getEmail());

		// can u create the login object?
		// then can u print the login detials?

		UserService service = UserService.getInstance();
		// userservice object
		// main is consuming the service ?
		for(int i=1;i<=11;i++) {
			
			Register register2=new Register();
			register2.setId("ab00"+i);
			register2.setFirstName("Abhi"+i);
			register2.setLastName("chivate"+i);
			register2.setPassword("abhi");
			String result=service.addUser(register2);
			//System.out.println(result);
		}
		
		Register register2 = service.getUserById("ab1");
		//System.out.println(register2!=null);

		for (Register register3 : service.getUsers()) {
			if(register3!=null)
			//System.out.println(register3);
				;
		}
		
		
		MovieService movservice= MoviesService.getInstance();
		SeriesService serservice = SeriesService.getInstance();

	}

}
/*
package com.zee.zee5_app;

import java.util.Iterator;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.service.UserService;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register register = new Register();
		//Register : class name
		// register : reference which will refer your object
		// new : is used to create the object 
		// Register() : constructor ===> DC ==> IDC
		
		register.setFirstName("abhi");
		register.setLastName("chivate");
		register.setEmail("abhi@gmail.com");
		register.setPassword("abhi1234");
		
		System.out.println(register);
		// whenever you will print the reference then it 
		// will call toString() method.
		
		System.out.println(register.toString());
	
		System.out.println(register.getEmail());
		
		// can u create the login object?
		// then can u print the login detials?

		UserService service = UserService.getInstance();

		for(int i=1;i<=20;i++) {

			Register register2 = new Register();
			register2.setId("ab00"+i);
			register2.setFirstName("abhi"+i);
			register2.setLastName("chivate"+i);
			register2.setPassword("abhi");
			String result = service.addUser(register2);
			System.out.println(result);
		}




		// userservice object
		// main is consuming the service ?

		Register register2 = service.getUserById("ab1");
		System.out.println(register2!=null);

		for (Register register3 : service.getUsers()) {
			if(register3!=null)
			System.out.println(register3);
		}

	}

}

*/