package amrit.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k meters.";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach: " + fortuneService.getFortune();
	}

}
