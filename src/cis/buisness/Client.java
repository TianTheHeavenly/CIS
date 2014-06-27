package cis.buisness;

import java.util.*;

import app.DBService;

@SuppressWarnings( "unused" )
public class Client
{
	private boolean active;
	protected SoapBox soapBox;

	// personal information
	private String name;
	private String address;
	private String city;
	private String province;
	private String postCode;
	private Date DOB;
	private String homePhone;
	private String workPhone;

	private boolean physician;
	private boolean physioTherapist;
	private boolean chiropractor;
	private boolean prev_experience;

	private String reason;

	private Map<String, String> reports = new HashMap<String, String>();
	private String[] historyReports;

	private boolean diet;
	private boolean oral_medication;
	private boolean insulin;
	private boolean uncontrolled;

	// Personal Habits and Lifestyle
	private String occupation;
	private String sports;
	private String sleepPattern;

	private int smoking;
	private int alcohol;
	private int stress;
	private int appetite;
	private int key;


	public Client()
	{
		setActive( true );
		this.soapBox = new SoapBox( "NULL" );

		physician = false;
		physioTherapist = false;
		chiropractor = false;
		prev_experience = false;

		diet = false;
		oral_medication = false;
		insulin = false;
		uncontrolled = false;

		historyReports = new String[17];
		
		DOB = new Date();
		
		key = DBService.getCurrentKey();
	}


	public Client( String name )
	{
		this.name = name;
		setActive( true );
		this.soapBox = new SoapBox( this.name );

		physician = false;
		physioTherapist = false;
		chiropractor = false;
		prev_experience = false;

		diet = false;
		oral_medication = false;
		insulin = false;
		uncontrolled = false;
		
		DOB = new Date();
		
		key = DBService.getCurrentKey();
	}


	@SuppressWarnings( "deprecation" )
	public int getAge()
	{
		Date current = new Date();
		int current_year = current.getYear();
		int year = this.DOB.getYear();
		int age = current_year - year;
		return age;
	}


	public void setActive( boolean active )
	{
		this.active = active;
	}
	
	
	public void setKey( int key )
	{
		if ( key > -1 )
		{
			this.key = key;
		}
	}
	
	public int getKey()
	{
		return key;
	}


	public boolean isActive()
	{
		if ( active == true )
		{
			// Date date = visits.last().getDate();
			// Date today = new Date();
			// int year = date.getYear();
			// int this_year = today.getYear();
			// if(this_year>year)
			// setActive(false);
		}
		return active;
	}


	public void addSoap( String info )
	{
		Date today = new Date();
		soapBox.add( today, info );
	}
	
	
	public void addSoap( Soap soap )
	{
		soapBox.add(  soap );
	}


	public void addSoap( Date date, String info )
	{
		soapBox.add( date, info );
	}


	public Soap lastSoap()
	{
		return soapBox.last();
	}


	public SoapBox getSoaps()
	{
		return soapBox;
	}


	public void setName( String name )
	{
		this.name = name;
	}


	public void setAddress( String address )
	{
		this.address = address;
	}


	public void setCity( String city )
	{
		this.city = city;
	}


	public void setProvince( String province )
	{
		this.province = province;
	}


	public void setPostCode( String postCode )
	{
		this.postCode = postCode;
	}


	public void setDOB( String DOB )
	{
		// this.DOB = new Date(DOB);
	}


	public void setHomePhone( String phone )
	{
		this.homePhone = phone;
	}


	public void setWorkPhone( String phone )
	{
		this.workPhone = phone;
	}


	public void setSleepPattern( String sleepPattern )
	{
		this.sleepPattern = sleepPattern;
	}


	public void setSmoking( int smoking )
	{
		if ( smoking >= 0 && smoking < 3 )
		{
			this.smoking = smoking;
		}
	}


	public void setAlcohol( int alcohol )
	{
		if ( alcohol >= 0 && alcohol < 3 )
		{
			this.alcohol = alcohol;
		}
	}


	public void setStress( int stress )
	{
		if ( stress >= 0 && stress < 3 )
		{
			this.stress = stress;
		}
	}


	public void setAppetite( int appetite )
	{
		if ( appetite >= 0 && appetite < 2 )
		{
			this.appetite = appetite;
		}
	}
	
	
	public int getSmoking()
	{
		return smoking;
	}
	
	
	// Don't mind if I do :)
	public int getAlcohol()
	{
		return alcohol;
	}
	
	
	public int getStress()
	{
		return stress;
	}
	
	
	public int getAppetite()
	{
		return appetite;
	}


	public String getSleepPattern()
	{
		return sleepPattern;
	}


	public String getName()
	{
		return name;
	}


	public String getAddress()
	{
		return address;
	}


	public String getCity()
	{
		return city;
	}


	public String getProvince()
	{
		return province;
	}


	public String getPostCode()
	{
		return postCode;
	}


	public Date getDOB()
	{
		return DOB;
	}


	public String getHomePhone()
	{
		return homePhone;
	}


	public String getWorkPhone()
	{
		return workPhone;
	}
	
	
	public Boolean getActive()
	{
		return active;
	}


	public void setPhysician( boolean physician )
	{
		this.physician = physician;
	}


	public void setPhysioTherapist( boolean physioTherapist )
	{
		this.physioTherapist = physioTherapist;
	}


	public void setChiropractor( boolean chiropractor )
	{
		this.chiropractor = chiropractor;
	}


	public void setExperience( boolean experience )
	{
		this.prev_experience = experience;
	}


	public boolean getPhysician()
	{
		return physician;
	}


	public boolean getPhysioTherapist()
	{
		return physioTherapist;
	}


	public boolean getChiropractor()
	{
		return chiropractor;
	}


	public boolean getExperience()
	{
		return prev_experience;
	}


	public void setReason( String reason )
	{
		this.reason = reason;
	}


	public String getReason()
	{
		return reason;
	}


	public void set( String identifier, String report )
	{
		reports.put( identifier, report );
	}


	public String get( String identifier )
	{
		return reports.get( identifier );
	}


	public void setDiet( boolean diet )
	{
		this.diet = diet;
	}


	public void setMedication( boolean oral_medication )
	{
		this.oral_medication = oral_medication;
	}


	public void setInsulin( boolean insulin )
	{
		this.insulin = insulin;
	}


	public void setUncontrolled( boolean uncontrolled )
	{
		this.uncontrolled = uncontrolled;
	}


	public boolean getDiet()
	{
		return diet;
	}


	public boolean getMedication()
	{
		return oral_medication;
	}


	public boolean getInsulin()
	{
		return insulin;
	}


	public boolean getUncontrolled()
	{
		return uncontrolled;
	}


	public void setOccupation( String occupation )
	{
		this.occupation = occupation;
	}


	public void setSports( String sports )
	{
		this.sports = sports;
	}


	public String getOccupation()
	{
		return occupation;
	}


	public String getSports()
	{
		return sports;
	}


	public String toString()
	{
		return name;
	}
}