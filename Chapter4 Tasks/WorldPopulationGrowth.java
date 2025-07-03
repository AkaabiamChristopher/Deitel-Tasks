public class WorldPopulationGrowth {
    public static void main(String[] args) {
        
        double currentPopulation = 7.9e9;
	double growthRate = 0.008;
  
        int years = 75;

        
        System.out.printf("%5s | %20s | %15s%n", "Year", "Population", "Increase");
        System.out.println("----------------------------------------------------------------");

        double previousPopulation = currentPopulation;
        int doublingYear = 0;

        
        for (int year = 1; year <= years; year++) {
            double newPopulation = currentPopulation * Math.pow(1 + growthRate, year);
            double increase = newPopulation - previousPopulation;
            System.out.printf("%5d | %20.2f billion | %15.2f million%n", year, newPopulation / 1e9, increase / 1e6);

           
            if (newPopulation >= 2 * 7.9e9 && doublingYear == 0) {
                doublingYear = year;
                System.out.println("\nThe population will double in approximately " + doublingYear + " years.");
            }
 
           
        } 
    }
}