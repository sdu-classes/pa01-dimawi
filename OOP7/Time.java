package object.OOP7;

public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour= hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }
    @Override
    public String toString(){
        if(hour<10 && minute<10 && second<10)
            return "0"+hour+":0"+minute+":0"+second;
        else if(hour<10 && minute<10)
            return "0"+hour+":0"+minute+":"+second;
        else if(minute<10 && second<10)
            return hour+":0"+minute+":0"+second;
        else if(hour<10 && second<10)
            return "0"+hour+":"+minute+":0"+second;
        else return hour+":"+minute+":"+second;

    }
    public Time nextSecond(){
        second++;
        if(second>=60) {
            second = second % 60;
            minute += 1;
            if (minute >= 60) {
                minute = minute % 60;
                hour += 1;
                if (hour >= 24)
                    hour = hour % 24;
            }
        }

        return this;
    }

    public Time previousSecond(){
        second--;
        if(second<=-1){
            second+=60;
            minute-=1;
            if(minute<0){
                minute+=60;
                hour-=1;
                if(hour<0)
                    hour+=24;
            }
        }
        return new Time(hour,minute,second);
    }

}

