package projects.android.my.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<AndroidVersion> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        listItems = new ArrayList<>();
        AndroidVersion androidVersion = new AndroidVersion("Alpha");
        listItems.add(androidVersion);
        androidVersion = new AndroidVersion("Beta");
        listItems.add(androidVersion);
        androidVersion = new AndroidVersion("Cupcake");
        listItems.add(androidVersion);
        androidVersion = new AndroidVersion("Donut");
        listItems.add(androidVersion);
        androidVersion = new AndroidVersion("Eclair");
        listItems.add(androidVersion);
        androidVersion = new AndroidVersion("Froyo");
        listItems.add(androidVersion);


        adapter = new Adapter(listItems,this);

        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.toolmenu,menu);
        return  true;
    }
}
