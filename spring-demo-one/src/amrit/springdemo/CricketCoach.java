package amrit.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside cricket coach no arg constructor.");
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
