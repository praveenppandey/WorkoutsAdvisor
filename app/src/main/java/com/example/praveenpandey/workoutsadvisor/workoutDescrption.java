package com.example.praveenpandey.workoutsadvisor;

import java.util.ArrayList;
import java.util.List;

public class workoutDescrption
{
    List <String> getWorkDetails (String workoutDetails)
    {
        List <String> strWorkoutValue = new ArrayList<String>();
        if(workoutDetails.equals("CHEST"))
        {
            strWorkoutValue.add("Bench Press");
            strWorkoutValue.add("Push Ups");
        }
        else if (workoutDetails.equals("TRICEPS"))
        {
            strWorkoutValue.add("Extension");
            strWorkoutValue.add("push ups");
        }
        return strWorkoutValue;
    }
}
