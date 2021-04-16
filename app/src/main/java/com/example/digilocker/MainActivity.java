package com.example.digilocker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        this is for add logo in action bar
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setIcon(R.drawable.log);
        getSupportActionBar().hide();


        BottomNavigationView bottom = findViewById(R.id.bottom_navigation);
        bottom.setOnNavigationItemSelectedListener(navListner);
//        This code is to move t the fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,
                new Homefragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.home:
                            selectedFragment = new Homefragment();
                            break;
                        case R.id.browser:
                            selectedFragment = new Browserfragment();
                            break;
                        case R.id.account:
                            selectedFragment = new Accountfragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,
                            selectedFragment).commit();
                    return true;
                }
            };
}
