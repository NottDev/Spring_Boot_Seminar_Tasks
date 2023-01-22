package com.seminar_task.college.services.utilities;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculateAge {

    /**
     * Method that checks and returns the year of a date.
     * @param date Date string in format mm/dd/yyyy
     * @return Integer year found, or null if no matches found.
     */
    public Integer getDobYear(String date){
        String[] splitDate = date.split("/");

        for (String element: splitDate) {
            if(element.length() > 3){
                return Integer.parseInt(element);
            }
        }

        return null;
    }

    /**
     * Method that calculates age based on year of birth passed as argument
     * @param year Year integer passed as argument
     * @return Integer year found, or null if no matches found.
     */
    public Integer foundAge(Integer year){
        Date date = new Date();
        Calendar currentDate = new GregorianCalendar();
        currentDate.setTime(date);
        Integer thisYear = currentDate.get(Calendar.YEAR);

        try{
            return thisYear - year;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
