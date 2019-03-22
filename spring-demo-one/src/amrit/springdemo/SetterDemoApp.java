package amrit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// invoke methods
		System.out.println(myCricketCoach.getDailyWorkout());
		
		System.out.println(myCricketCoach.getDailyFortune());
		
		System.out.println("Email Address: " + myCricketCoach.getEmailAddress());
		
		System.out.println("Team: " + myCricketCoach.getTeam());
		
		// close context
		context.close();

	}

}
