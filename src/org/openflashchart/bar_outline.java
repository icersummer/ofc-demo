package org.openflashchart;

import java.util.ArrayList;
import java.util.List;


public class bar_outline extends bar
{
	//TODO maybe it's deprecated ?
	String $outline_colour;
	String outline_colour;

//	public bar_outline(String alpha, String colour) {
//		super(alpha, colour);
//		// TODO Auto-generated constructor stub
//	}
	
	public bar_outline(String $alpha, String $colour,String $outline_colour )
	{
		super( $alpha, $colour );
		this.var = "filled_bar";
		this.outline_colour = $outline_colour;
	}
	
	// override the base method
	public List<String> _get_variable_list()
	{
		List<String> values = new ArrayList<String>();
		values.add(this.alpha);
		values.add(this.colour);
		values.add(this.outline_colour);
		
		if( this._key )
		{
			values.add(this.key);
			values.add(this.key_size + "");
		}
		
		return values;
	}
}