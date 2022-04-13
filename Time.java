public class Time {
public static void main(String[] args){
int hour = 10;
int minute = 59;
int second = 59;
System.out.println("Number of seconds to midnight:" +((60-second) + ((60-1-minute)*60) + (24-1-hour)*3600));

      }
}