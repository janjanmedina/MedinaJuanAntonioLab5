package con.medina.juanantonio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i =  new Intent(this, MyService.class);
        startService(i);
    }

    public void activity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void map(View v) {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.mapbutt1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select your map app");
            startActivity(chooser);
        }
    }
}
