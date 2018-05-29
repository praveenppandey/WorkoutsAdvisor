package com.example.praveenpandey.workoutsadvisor;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class find_workout extends Activity {

    private workoutDescrption wkOut = new workoutDescrption();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);
    }

    public void onClicFindWorkout(View view)
    {
        TextView txtWorkout = (TextView)findViewById(R.id.showWorkDetails);
        Spinner spinnerWoroutTypes = (Spinner)findViewById(R.id.spinWorkoutTypes);



            if (spinnerWoroutTypes.getSelectedItemPosition() == 0)
            {

                Toast.makeText(getApplicationContext(), "Please select correct value of workout types", Toast.LENGTH_LONG).show();
            }
            else
             {

                String strWorkouts = String.valueOf(spinnerWoroutTypes.getSelectedItem());

                //txtWorkout.setText(strWorkouts);

                 List <String> workoutList = wkOut.getWorkDetails(strWorkouts);

                 StringBuilder workFormat = new StringBuilder();

                 for(String work : workoutList)
                 {
                     workFormat.append(work).append("\n");
                 }
                 txtWorkout.setText(workFormat);

            }

    }
}
