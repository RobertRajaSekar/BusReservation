package BusResv;

public class Bus {
	private int BusNo;
	private boolean AC;
	private int Capacity;
	
	Bus(int no,boolean ac,int cap){
		BusNo = no;
		AC = ac;
		Capacity = cap;
		
	}
	public int getBusNo() {
		return BusNo;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int cap) {
		Capacity = cap;
	}
	public boolean getAC() {
		return AC;
	}
	public void setAC(boolean ac) {
		AC = ac ;
		}

   public void displyBusinfo(){
    	 System.out.println(" Bus No : " + BusNo + " AC : " + AC + " Total Capacity : " + Capacity);
    }
    
    
    
}