package cis.buisness;

import java.util.*;

public class Soap implements Comparable<Soap>
{
	private MyDate date;
	private String info;


	public Soap()
	{
		assert( false );
	}

	public Soap( MyDate date, String info )
	{
		this.date = date;
		this.info = info;
	}


	@Override
	public String toString()
	{
		return info + " - " + date.toString();
	}


	@Override
	public int compareTo( Soap other )
	{
		//return this.date.compareTo( other.getDate() );
		return 1;
	}


	public void setDate( MyDate date )
	{
		this.date = date;
	}


	public void setInfo( String info )
	{
		this.info = info;
	}


	public String getDate()
	{
		return date.toString();
	}


	public String getInfo()
	{
		return info;
	}
}
