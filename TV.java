package oop;

public class TV {
	public int channel;
	public int volume;
	public boolean on;
	
	public TV() {
		channel = 1;
		volume = 4;
		on = false;
	}
	
	//on
	public void switchOn() {
		on = true;
	}
	
	//off
	public void switchOff() {
		on = false;
	}
	
	//switch channel
	public void setChannel(int newChannel) {
		if(newChannel > 120 || newChannel<1 || !on) {
			return;
		}
		
		channel = newChannel;
	}
	
	//up channel
	public void ChannelUp() {
		if(channel==120 || !on) {
			return;
		}
		
		channel++;
	}
	
	//down channel
	public void ChannelDown() {
		if(channel==1 || !on) {
			return;
		}
		
		channel--;
	}
	
	public void setVolume(int newVolume) {
		if(newVolume>7 || newVolume<1 || !on) {
			return;
		}
		
		volume = newVolume;
	}
	
	//up volume
	public void VolumeUp() {
		if(volume==7 || !on) {
			return;
		}	
		volume--;
	}
		
	//down volume
	public void VolumeDown() {
		if(volume==1 || !on) {
			return;
		}	
		volume--;
	}
	
	//print TV info
	public void TVinfo() {
		System.out.println("channel " + channel + ", volume " + volume + ", on: " + on);
	}
}
