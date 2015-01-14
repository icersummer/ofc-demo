package org.openflashchart;

class hlc extends data_set
{
	final int high;
	final int low; 
	final int close;	
	public hlc( int high, int low, int close )
	{
		this.high = high;
		this.low = low;
		this.close = close;
	}
	
	public String toString(String arg0, String arg1)
	{
		return "["+high+","+low+","+close+"]";
	}
}