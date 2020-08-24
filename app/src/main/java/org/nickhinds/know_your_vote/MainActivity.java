package org.nickhinds.know_your_vote;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


// Minimum API Level 21
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

	private DrawerLayout drawer;
	private TextView quotes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// sets up the navigations/ drawerlayout
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		getSupportActionBar().setDisplayShowTitleEnabled(false);

		drawer = findViewById(R.id.drawer_layout);

		NavigationView navigationView = findViewById(R.id.nav_id);
		navigationView.setNavigationItemSelectedListener(this);

		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.addDrawerListener(toggle);
		toggle.syncState();

		// displays a random quote of 4 on the home page
		quotes = findViewById(R.id.tvQuotes);
		Random rand = new Random();
		int quotesGen = rand.nextInt(4);

		if (quotesGen == 0)
		{
			quotes.setText(R.string.quote1);
		}
		else if (quotesGen == 1)
		{
			quotes.setText(R.string.quote2);
		}
		else if (quotesGen == 2)
		{
			quotes.setText(R.string.quote3);
		}
		else if (quotesGen == 3)
		{
			quotes.setText(R.string.quote4);
		}
		quotes.setVisibility(View.VISIBLE);
	}

	// sets the fragment chosen in the nav menu
	@Override
	public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
		switch (menuItem.getItemId()) {
			case R.id.register:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new RegisterToVote()).commit();
				quotes.setVisibility(View.GONE);
				break;
			case R.id.vote:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new HowToVote()).commit();
				quotes.setVisibility(View.GONE);
				break;
			case R.id.game:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new Game()).commit();
				quotes.setVisibility(View.GONE);
				break;
			case R.id.more:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new More()).commit();
				quotes.setVisibility(View.GONE);
				break;
			case R.id.video1:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new Video1()).commit();
				quotes.setVisibility(View.GONE);
				break;
			case R.id.video2:
				getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new Video2()).commit();
				quotes.setVisibility(View.GONE);
				break;
		}
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

	@Override
	public void onBackPressed()
	{
		if (drawer.isDrawerOpen(GravityCompat.START))
		{
			drawer.closeDrawer(GravityCompat.START);
		} else
		{
			super.onBackPressed();
		}
	}
}
