package tr.edu.mu.ceng.mad.obs.mymoviebrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Movie movie = getIntent().getParcelableExtra("movie");

        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        fts.add(R.id.container,DetailsFragment.newInstance(movie));
        fts.commit();


    }
}