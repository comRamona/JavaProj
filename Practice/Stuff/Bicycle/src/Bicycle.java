public class Bicycle {
	
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
    public static int getNr() { cadence=9;
    	return numberOfBicycles;
    }
    

public static void main(String[] args) {
	Bicycle bici=new Bicycle(9,2,3);
	bici.gear=3;
	Bicycle bici2=new Bicycle(7,2,3);
	System.out.println(Bicycle.numberOfBicycles+" "+bici.getID()+" "+bici.gear+" "+salut.sth()+Bicycle.numberOfBicycles);
	
} }
class salut{
	public static int sth() { Bicycle bici3=new Bicycle(2,3,4); return bici3.getID();}
}