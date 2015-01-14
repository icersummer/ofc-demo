package org.openflashchart;


class candle extends data_set
{
	final int high;
	final int low; 
	final int close;
	final int open;
	
	public candle( int high, int open, int close, int low )
	{
		this.high = high;
		this.low = low;
		this.close = close;
		this.open = open;
	}
	
	public String toString(String arg0, String arg1)
	{
		return "["+high+","+open+","+low+","+close+"]";
	}
}