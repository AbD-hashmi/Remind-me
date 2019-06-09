package personaluseonly.grayreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPage extends AppCompatActivity implements View.OnClickListener {

    Button bReminder,bTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_page);

        //initializing buttons
        bReminder=(Button)findViewById(R.id.reminder_start);
        bTracker=(Button)findViewById(R.id.tracker_start);

        //adding click listener to the buttons
        bTracker.setOnClickListener(this);
        bReminder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==bReminder){
            Intent ReminderIntent= new Intent(this,MainActivity.class);
            startActivity(ReminderIntent);
        }
        if (v==bTracker){
            Intent TrackerIntent= new Intent(this,TrackerStart.class);
            startActivity(TrackerIntent);
        }
    }
}
