package TakeHome747;

public class TIME extends MeetingTime {
/*	
	private int StartTime;
	private int EndTime;
	private String Day;
	private int TimeOfDay ;
*/
	
	
	
	
	
	public TIME(){
		StartTime= 0;
		EndTime =  0;
		}
	
	public TIME(int start,int end ){
		
		this.StartTime= start;
		this.EndTime = end;
		
		}
	
	
	
	
	
	public TIME(String string, int i, int j) {
		super(string, i, j);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the startTime
	 */
	public int getStartTime() {
		return StartTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		StartTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public int getEndTime() {
		return EndTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		EndTime = endTime;
	}
	
	
	public String GetDay(){
		if(StartTime>=800 && StartTime <= 2200  )
				Day ="MONDAY";
			else if(StartTime>=3200 && StartTime <= 4600  )
				 Day = "TUESDAY";
				else if(StartTime>=5600 && StartTime <= 7000  )
					Day = "WEDNESDAY";
				else if(StartTime>=8000 && StartTime <= 9400  )
					Day = "THRUSDAY";
				else if(StartTime>=10400 && StartTime <= 11800  )
					Day = "FRIDAY";
				else 
		return "invalid !";
		
		return Day;
		
			}

	
	public int GetTimeOfDay(){
		if(Day == "MONDAY")
			TimeOfDay = this.StartTime ;
		else if(Day =="TUESDAY")
			TimeOfDay = this.StartTime - 2400;
		else if(Day =="WEDNESDAY")
			TimeOfDay = this.StartTime - 4800;
		else if(Day =="THRUSDAY")
			TimeOfDay = this.StartTime - 7200;
		else if(Day =="FRIDAY")
			TimeOfDay = this.StartTime - 9600;
		else
			return 0;
		return TimeOfDay;
		}
	
	
	
	public boolean overlap(TIME course){
		if(this.StartTime == course.StartTime){
			
			return true;
		}
		else{
			return false;
		}
		
		
	}

}
