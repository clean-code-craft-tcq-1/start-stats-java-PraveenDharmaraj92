package statisticker;

import java.util.Arrays;
import java.util.List;

import statisticker.Statistics.Stats;

public class StatsChecker {
	
	private final IAlerter [] alerters;
	
	private final float maxThreshold;
	
	public StatsChecker(final float maxThreshold,final IAlerter [] alerters){
		this.maxThreshold= maxThreshold;
		this.alerters= alerters;
	}
	
	public void checkAndAlert(List<Float> numbers){
		Stats s = Statistics.getStatistics(numbers);
		if(s.max>this.maxThreshold){
			Arrays.asList(alerters).forEach(alerter->alerter.alert());
		}
	}

}
