package mu.edu.tr.tapputi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ikizler extends AppCompatActivity {

    ImageView homeButton;
    ImageView filterButton;
    ImageView favoriteButton;
    ImageView cartButton;
    ImageView accountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikizler);
        homeButton = findViewById(R.id.homeButton);
        filterButton = findViewById(R.id.filterButton);
        favoriteButton = findViewById(R.id.favoritesButton);
        cartButton = findViewById(R.id.cartButton);
        accountButton = findViewById(R.id.accountButton);
    }
    public void butons() {

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ikizler.this, MainActivity.class);
                startActivity(intent);
            }


        });

        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ikizler.this, discoverTab.class);
                startActivity(intent);
            }


        });
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ikizler.this, favoritesTab.class);
                startActivity(intent);
            }


        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ikizler.this, Account.class);
                startActivity(intent);
            }


        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ikizler.this, shoppingCartTab.class);
                startActivity(intent);
            }


        });
    }
}