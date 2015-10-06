package fr.iutvalence.info.m3105.stackmachine;

public interface CPUInterface {
	
	
	public  void wireToIoSubsystem(IO ioSystem);
	public  void wireToCallStack(Stack callStack);
	public  void wireToExpStack(Stack expStack);
	public  void wireToProgramMemory(Memory programMemory);
	public void write(Object opCode, int currentAdress);

}
