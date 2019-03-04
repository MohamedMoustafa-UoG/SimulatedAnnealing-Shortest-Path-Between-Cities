import java.util.ArrayList;
public class SimulatedAnnealing
{
    private static ArrayList destinationCities = new ArrayList<City>();
    static double temp=100000;
    static double coolingRate=0.0003;

    public static void main(String[] args)
    {
        for(int i=0;i<201;i++)
        {
            City city=new City();
            destinationCities.add(city);
        }
        Tour currentSolution = new Tour();
        currentSolution.generateIndividual();
        System.out.println("Initial solution distance: " + currentSolution.getDistance());
        
        Tour best = new Tour(currentSolution.getTour());
        
        while(temp>1)
        {
            Tour newSolution = new Tour(currentSolution.getTour());
            
            int tourPos1=(int) (newSolution.tourSize() * Math.random());
            int tourPos2=(int) (newSolution.tourSize() * Math.random());
            
            City citySwap1=newSolution.getCity(tourPos1);
            City citySwap2=newSolution.getCity(tourPos2);
            
            newSolution.setCity(tourPos1,citySwap2);
            newSolution.setCity(tourPos2,citySwap1);
            
            int currentEnergy = currentSolution.getDistance();
            int neighbourEnergy = newSolution.getDistance();
            
            if(currentEnergy>neighbourEnergy)
            {
                currentSolution=new Tour(newSolution.getTour());
            }else if((Math.exp((neighbourEnergy - currentEnergy) / temp))>(Math.random()))
            {
                currentSolution=new Tour(newSolution.getTour());
            }
            
            if(currentSolution.getDistance()<best.getDistance())
            {
                best = new Tour(currentSolution.getTour());
            }
            
            temp *= 1-coolingRate;
        }
        
        System.out.println("Final solution distance: " + best.getDistance());
        System.out.println("Tour: " + best);
    }

    public static int numberOfCities()
    {
        return destinationCities.size();
    }
    
    public static City getCity(int index)
    {
        return (City)destinationCities.get(index);
    }
}
