public class City
{
    private int x;
    private int y;
    public City()
    {
        x=(int)(Math.random()*2000);
        y=(int)(Math.random()*2000);
    }
    
    public City(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    
    public double getDistance(City destination )
    {
        int xDistance=Math.abs(this.getX()-destination.getX());
        int yDistance=Math.abs(this.getY()-destination.getY());
        double distance=Math.sqrt(Math.pow(xDistance,2)+Math.pow(yDistance,2));
        return distance;
    }
    
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
}
