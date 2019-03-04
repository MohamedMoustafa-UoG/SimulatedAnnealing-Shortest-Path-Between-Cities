import java.util.*;
public class Tour
{
    ArrayList<City> tour = new ArrayList();
    private int distance=0;
    public Tour()
    {
        for(int i=0;i<SimulatedAnnealing.numberOfCities();i++)
        {
            tour.add(null);
        }
    }
    
    public Tour(ArrayList tour)
    {
        this.tour = (ArrayList) tour.clone();
    }

    public ArrayList getTour(){
        return tour;
    }

    public void generateIndividual() {
        for (int cityIndex = 0; cityIndex < SimulatedAnnealing.numberOfCities(); cityIndex++) {
            setCity(cityIndex, SimulatedAnnealing.getCity(cityIndex));
        }
        Collections.shuffle(tour);
    }


    public City getCity(int tourPosition) {
        return (City)tour.get(tourPosition);
    }

    public void setCity(int tourPosition, City city) {
        tour.set(tourPosition, city);
        distance = 0;
    }

    public int getDistance(){
        if (distance == 0) {
            int tourDistance = 0;
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++) {
                City fromCity = getCity(cityIndex);
                City destinationCity;
                if(cityIndex+1 < tourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }
                tourDistance += fromCity.getDistance(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }

    public int tourSize() {
        return tour.size();
    }

    @Override
    public String toString() {
        String geneString = "|";
        for (int i = 0; i < tourSize(); i++) {
            geneString += getCity(i)+"|";
        }
        geneString += getCity(0)+"|";
        return geneString;
    }
}
