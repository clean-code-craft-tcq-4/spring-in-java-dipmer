package statisticker;

import java.util.*;

public class Statistics 
{
    public static Stats getStatistics(List<___> numbers) {
        //implement the computation of statistics here
    }
    public static class Stats 
    {
        Float min, average, max;

        public Stats(Float minimum, Float avg, Float maximum)
        {
            this.min = minimum;
            this.average = avg;
            this.max = maximum;
        }
    } 
    
    
    public static Stats getStatistics(List<Float> numbers) {
        if(numbers.isEmpty())
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        Float min = Collections.min(numbers);
        Float average = 0f;
        Float max = Collections.max(numbers);
	Float total = 0f;
        for (int index = 0; index < numbers.size(); index++)
            total+=numbers.get(index);
        average = total/(numbers.size());
        Stats statsObject = new Stats(min,average,max);
        return statsObject;
    } 
    
    
    
    
    
}
