package org.openflashchart;

import java.util.ArrayList;
import java.util.List;


public class bar extends data_set
{
	String colour;
	String alpha;
	public List<String> data;
	List<String> links;
	boolean _key;
	String key;
	int key_size;
	String var;
	
	public bar( String alpha, String colour )
	{
		this.var = "bar";
		
		this.alpha = alpha;
		this.colour = colour;
		this.data = new ArrayList<String>();
		this.links = new ArrayList<String>();
		this._key = false;
	}

	public void key( String key, int size )
	{
		this._key = true;
		this.key = key;
		this.key_size = size;
	}
	
	public void add( String data, String link )
	{
		this.data.add(data);
		this.links.add(link);
	}
	
	public String toString( String output_type, String set_num )
	{
		String values = this.alpha +","+ this.colour;
		
		if( this._key )
		{
			values += ","+this.key +","+ this.key_size;
		}
		String tmp = null;
		if( output_type.equals("js") )
		{
			tmp = "so.addVariable(\""+this.var+"\",\""+values+"\");";
		}
		else
		{
			tmp  = "&"+this.var+set_num+"="+values+"&";
			tmp += "\r\n";
			tmp += "&values"+set_num+"="+implode( ",", this.data )+"&";
			if( this.links.size() > 0 )
			{
				tmp += "\r\n";
				tmp += "&links"+set_num+"="+implode( ",", this.links )+"&";	
			}
		}

		return tmp;
	}
	
}
