package con.medina.juanantonio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i =  new Intent(this, MyService.class);
        startService(i);
    }

    public void activity1(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void map(View v) {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.mapbutt2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select your map app");
            startActivity(chooser);
        }
    }
}
