package com.example.favmusic;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class MusicActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.music, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		static ArrayList<Musics> listItems = new ArrayList<Musics>();
		
		static {
			// TODO Auto-generated method stub
			listItems.add(new Musics(R.drawable.ic_launcher, "A new day as come", "Celin Dion"));
			listItems.add(new Musics(R.drawable.ic_launcher, "A new day as come", "Celin Dion"));
			listItems.add(new Musics(R.drawable.ic_launcher, "A new day as come", "Celin Dion"));
			listItems.add(new Musics(R.drawable.ic_launcher, "A new day as come", "Celin Dion"));
		}
		
		
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_music,
					container, false);
			ListView ls = (ListView)rootView.findViewById(R.id.listView);
			
			MusicAdapter adapter = new MusicAdapter(getActivity(), R.layout.fragment_music, listItems);
			ls.setAdapter(adapter);
			
			return rootView;
		}

	}
}
