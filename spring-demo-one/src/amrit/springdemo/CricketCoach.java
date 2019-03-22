package amrit.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for email address and team.
	private String emailAddress;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside cricket coach no arg constructor.");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress in cricket coach class.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setTeam in cricket coach class.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling.";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setFortuneService in cricket coach class.");
		this.fortuneService = theFortuneService;
	}

}
