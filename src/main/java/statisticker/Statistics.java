package statisticker;

import java.util.List;

public class Statistics 
{
	
	/**
	 * Method to calculate statistics
	 * @param numbers  input
	 * @return Stats 
	 */
	public static Stats getStatistics(List<Float> numbers) {
		
		Float max = (float) numbers.stream().mapToDouble(num->num).max().orElse(Float.NaN); 
		Float min = (float) numbers.stream().mapToDouble(num->num).min().orElse(Float.NaN);
		Float average = (float) numbers.stream().mapToDouble(num->num).average().orElse(Float.NaN);
		return new Stats(max, min, average);
	}
    
    public static class Stats{
    	
    	final Float max;
    	final Float min;
    	final Float average;
    	
    	public Stats(final Float max, final Float min, final Float average){
    		this.average= average;
    		this.min= min;
    		this.max = max;
    	}
    	
    }
}
