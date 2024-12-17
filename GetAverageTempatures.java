import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class GetAverageTempatures{

public static void main(String [] args){

ArrayList<String> Days = new ArrayList<>(Arrays.asList("sunday","monday","tuesday","wednesday","thursday","friday","saturday"));
ArrayList<Integer> DailyTemps = new ArrayList<Integer>(Arrays.asList
((40+31)/2,(54+33)/2,(52+33)/2,(39+30)/2,(49+23)/2,(32+22)/2,(38+26)/2)); 
Scanner scanner = new Scanner(System.in);
String userInputDay;
int dayIndex = -1;



while(dayIndex == -1)
{
System.out.println("Enter a day of the week to display weekly Average tempatures.");
userInputDay = scanner.next();

switch(userInputDay.toLowerCase())
{
case "sunday" :
dayIndex = 0;
break;
case "monday" :
dayIndex = 1;
break;
case "tuesday" :
dayIndex = 2;
break;
case "wednesday" :
dayIndex = 3;
break;
case "thursday" :
dayIndex = 4;
break;
case "friday" :
dayIndex = 5;
break;
case "saturday" :
dayIndex = 6;
break;
default :
dayIndex = -1;
}
if(dayIndex!=-1){break;}}
for(int i = dayIndex;i<7;i++)
{
System.out.println("Day: " + (Days.get(i)).toUpperCase() + "\nAverage Tempature: " + DailyTemps.get(i));
}
for(int k = 0;k<dayIndex;k++)
{
System.out.println("Day: " + Days.get(k).toUpperCase() + "\nAverage Tempature: " + DailyTemps.get(k));
}
scanner.close();

}}
