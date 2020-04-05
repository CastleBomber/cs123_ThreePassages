package castlebomber.richie.threepassages;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import castlebomber.richie.threepassages.databinding.ActivityMainBinding;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }

    public void onTopBtnClicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gutenberg.org/cache/epub/2489/pg2489-images.html"));
        startActivity(intent);

        //String message = "top unlocked";
        //Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onMiddleBtnClicked(View v){
        String message = "middle unlocked";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onBottomBtnClicked(View v){
        String message = "bottom unlocked";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked(View v){
        //ui.ratingBar.setRating(0);
        //ui.comment.setText("");
    }
}