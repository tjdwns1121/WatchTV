package watchTV;

public class TV {
	int channel = 7;
	int volume = 20;
	boolean power = false;
	public int channelUp(){
		return channel++;
	}
	public int channelDown(){
		return channel--;
	}
	public int volumeUp(){
		return volume++;
	}
	public int volumeDown(){
		return volume--;
	}
	public void powerOn(){
		power = true;
	}
	public void powerOff(){
		power = false;
	}
	public void setChannel(int channel){
		this.channel = channel;
	}
	public int getChannel(){
		return channel;
	}
	public boolean isPower(){
		return power;	
	}
	public int getVolume(){
		return volume;
	}

}
