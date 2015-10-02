package fr.iutvalence.info.m3105.stackmachine;

public class Stack {
	
	private int[] array;
	private int sizeArray;
	private int currentSize;
	
	public Stack(int size){	
		this.array = new int[size];
		this.sizeArray = size;
		this.currentSize = 0;
	}
	
	public int takeElem(){
		this.currentSize--;
		return this.array[this.currentSize+1];
		
	}
	
	public void putElem(int element){
		this.currentSize++;
		this.array[this.currentSize] = element;
	}
}
