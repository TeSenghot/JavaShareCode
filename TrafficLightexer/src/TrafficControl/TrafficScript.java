package TrafficControl;

public class TrafficScript {
	int light1,light2,light3;
	int duration;
	String tl1,tl2,tl3;
	
	public TrafficScript(int light1,int light2, int light3) {
		this.light1=light1;
		this.light2=light2;
		this.light3=light3;
		
	}
	
	public void ShowLight() {
		if (light1==1) {
			tl1="True";
		}
		else if (light1==0) {
			tl1="Flase";
		}
		
		if (light2==1) {
			tl2="True";
		}
		else if (light2==0) {
			tl2="Flase";
		}
		if (light3==1) {
			tl3="True";
		}
		else if (light3==0) {
			tl3="Flase";
		}
		System.out.println("The light is Red: "+tl1+"\nThe light is Green: "+tl2+"\nThe light is now green: "+tl3);
		//The Duration
		
	}
	
}

class Duration{
	int t1, t2;
	public Duration(int t1, int t2) {
		this.t1=t1;
		this.t2=t2;
	}
public void showtime() {
	System.out.println("The Light Duration is:"+t1+"\nThe Light Duration is now:"+t2);
}	
}


