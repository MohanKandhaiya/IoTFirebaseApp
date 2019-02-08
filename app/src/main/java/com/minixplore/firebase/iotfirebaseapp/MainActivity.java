package com.minixplore.firebase.iotfirebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView RetrievedData1, RetrievedData2, RetrievedData3, RetrievedData4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrievedData1 = (TextView)findViewById(R.id.retrievedData1);
        RetrievedData2 = (TextView)findViewById(R.id.retrievedData2);
        RetrievedData3 = (TextView)findViewById(R.id.retrievedData3);
        RetrievedData4 = (TextView)findViewById(R.id.retrievedData4);

        FirebaseDatabase dataBase = FirebaseDatabase.getInstance();
        final DatabaseReference concentration1 = dataBase.getReference("Concentration1");
        final DatabaseReference concentration2 = dataBase.getReference("Concentration2");
        final DatabaseReference concentration3 = dataBase.getReference("Concentration3");
        final DatabaseReference concentration4 = dataBase.getReference("Concentration4");

        // Read from the database
        concentration1.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Concentration1 = String.valueOf(dataSnapshot.getValue());
                RetrievedData1.setText(Concentration1);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        concentration2.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Concentration2 = String.valueOf(dataSnapshot.getValue());
                RetrievedData2.setText(Concentration2);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        concentration3.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Concentration3 = String.valueOf(dataSnapshot.getValue());
                RetrievedData3.setText(Concentration3);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        concentration4.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String Concentration4 = String.valueOf(dataSnapshot.getValue());
                RetrievedData4.setText(Concentration4);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

    }
}
