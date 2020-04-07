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

    // Goes to link
    public void onTopBtnClicked(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("BOOK_NAME", "The Eagle's Shadow");
        intent.putExtra("BOOK_FILENAME", "eagle.txt");
        startActivity(intent);
    }

    public void onMiddleBtnClicked(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("BOOK_NAME", "Moby Dick");
        intent.putExtra("BOOK_FILENAME", "moby.txt");
        startActivity(intent);
    }


    public void onBottomBtnClicked(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("BOOK_NAME", "The Sailor");
        intent.putExtra("BOOK_FILENAME", "sailor.txt");
        startActivity(intent);
    }
}