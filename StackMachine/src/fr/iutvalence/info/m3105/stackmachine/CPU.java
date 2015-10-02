
package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;
public class CPU {
  public static final int HALT =  0x00;

  public static final int PUSH =  0x01;

  public static final int ADD =  0x02;

  public static final int SUB =  0x03;

  public static final int MUL =  0x04;

  public static final int DIV =  0x05;

  public static final int MOD =  0x06;

  public static final int NEG =  0x07;

  public static final int LT =  0x08;

  public static final int LE =  0x09;

  public static final int GT =  0x0A;

  public static final int GE =  0x0B;

  public static final int EQ =  0x0C;

  public static final int NE =  0x0D;

  public static final int IN =  0x0E;

  public static final int OUT =  0x0F;

  public static final int CALL =  0x10;

  public static final int RET =  0x11;

  public static final int JP =  0x12;

  public static final int JZ =  0x13;

  public static final int DUP =  0x14;

  public static final int POP =  0x15;
  
  private IO ioSystem;
  private Memory programmMemory;
  private Stack expStack;
  private Stack callStack;
  
  public CPU(){
	  
	  
  }
  
  
  public void run() {
		try
		{
			while (true)
			{
				// TODO something is missing here...
				int opCode = expStack.takeElem();
				// System.err.print("@" + this.programCounter + ": ");
				switch (opCode)
				{
					case HALT:
					{
						// System.err.println("HALT");
						this.ioSystem.displayProgramTermination();
						return;
					}
					case PUSH:
					{
						// TODO something is missing here...
						break;
					}
					case ADD:
					{
						// TODO something is missing here...
						break;
					}
					case SUB:
					{
						// TODO something is missing here...
						break;
					}
					case MUL:
					{
						// TODO something is missing here...
						break;
					}
					case DIV:
					{
						// TODO something is missing here...
						break;
					}
					case MOD:
					{
						// TODO something is missing here...
						break;
					}
					case NEG:
					{
						// TODO something is missing here...
						break;
					}
					case LT:
					{
						// TODO something is missing here...
						break;
					}
					case LE:
					{
						// TODO something is missing here...
						break;
					}
					case GT:
					{
						// TODO something is missing here...
						break;
					}
					case GE:
					{
						// TODO something is missing here...
						break;
					}
					case EQ:
					{
						// TODO something is missing here...
						break;
					}
					case NE:
					{
						// TODO something is missing here...
						break;
					}
					case IN:
					{
						// TODO something is missing here...
						break;
					}
					case OUT:
					{
						// TODO something is missing here...
						break;
					}
					case CALL:
					{
						// TODO something is missing here...
						break;
					}
					case RET:
					{
						// TODO something is missing here...
						break;
					}
					case JP:
					{
						// TODO something is missing here...
						break;
					}
					case JZ:
					{
						// TODO something is missing here...
						break;
					}
					case DUP:
					{
						// TODO something is missing here...
						break;
					}
					case POP:
					{
						// TODO something is missing here...
						break;
					}
					default:
					{
						// TODO something is missing here...
						return;
					}
				}
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{
			// TODO something is missing here...
		}		
  }

  public  void wireToIoSubsystem(IO ioSystem) {
  }

  public  void wireToCallStack(Stack callStack) {
  }

  public  void wireToExpStack(Stack expStack) {
  }

  public  void wireToProgramMemory(Memory programMemory) {
  }

  public void write(Object opCode, int currentAdress) {
  }

 

  public void clearStacks() {
  }

public void setPC(int address) {
	// TODO Auto-generated method stub
	
}
}
