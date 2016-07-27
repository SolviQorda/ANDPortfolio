package qorda_projects.sorengoardappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);

    }

    public void popMovies(View view)
    {
        Button popMovies = (Button) findViewById(R.id.popmovies);
        boolean popTap = popMovies.isPressed();
        if(popTap) {
            Toast.makeText(this, "This button will launch my Popular Movies App", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void stockHawk(View view)
    {
        Button stockHawk = (Button) findViewById(R.id.stockhawk);
        boolean stockTap = stockHawk.isPressed();
        if(stockTap)
        {
            Toast.makeText(this, "This button will launch my Stock Hawk app", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void builtItBigger(View view)
    {
        Button buildIt = (Button) findViewById(R.id.buildit);
        boolean buildTap = buildIt.isPressed();
        if(buildTap)
        {
            Toast.makeText(this, "This button will launch my Build it Bigger app", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void makeAppMaterial(View view)
    {
        Button makeAppMaterial = (Button) findViewById(R.id.material);
        boolean makeAppTapped = makeAppMaterial.isPressed();
        if(makeAppTapped)
        {
            Toast.makeText(this, "This button will launch my Material Design app", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void goUbiquitous(View view)
    {
        Button goUbiquitous = (Button) findViewById(R.id.ubiquitous);
        boolean ubitPressed = goUbiquitous.isPressed();
        if (ubitPressed)
        {
            Toast.makeText(this, "This button will launch my Go Ubiquitous app", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void capstone(View view)
    {
        Button capstone = (Button) findViewById(R.id.capstone);
        boolean capstoneTapped = capstone.isPressed();
        if(capstoneTapped)
        {
            Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
        }
    }
















}
