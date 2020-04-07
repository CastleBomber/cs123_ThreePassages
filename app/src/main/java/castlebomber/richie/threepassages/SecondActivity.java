package castlebomber.richie.threepassages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import castlebomber.richie.threepassages.databinding.ActivitySecondBinding;

/**
 * displays one of three text passages
 *
 * use an extra to indicate which of the three passages to display
 */
public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        Intent secondIntent = getIntent(); // the whole intent w/ two extras
        setTitle(secondIntent.getStringExtra("BOOK_NAME"));

        String text = "";
        try{
            InputStream is = getAssets().open(secondIntent.getStringExtra("BOOK_FILENAME"));
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        ui.passage.setText(text);

    }
}
