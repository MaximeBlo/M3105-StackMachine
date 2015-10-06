package fr.iutvalence.info.m3105.stackmachine;

public class Memory implements MemoryInterface {
	
	private int startAddress;
	private int endAddress;
	
	public Memory(int startAdr,int endAdr){
	}

	public int getStartAddress() {
		return this.startAddress;
	}
	
	public int getEnAddress() {
		return this.endAddress;
	}

	public void write(int currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

}
