import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.medical.R;
import com.example.medical.RecyclerViewAdaptery;
import com.example.medical.row;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private RecyclerViewAdaptery adapter;
    private StaggeredGridLayoutManager manager;
    private List<row> appList;

    int[]covers=new int[]{
            R.drawable.fash1,
            R.drawable.fash2,
            R.drawable.fash3,
            R.drawable.fash4,
            R.drawable.fash5,
            R.drawable.fash6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerView=findViewById(R.id.recyclerview);
        appList=new ArrayList<>();

        adapter=new RecyclerViewAdaptery()(this,appList);
        manager=new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(adapter);

        IntializeDataIntoRecyclerView();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.img_1);


    }
    private void IntializeDataIntoRecyclerView(){
        row a=new row(covers[0]);
        appList.add(a);

        row a=new row(covers[1]);
        appList.add(a);

        row a=new row(covers[2]);
        appList.add(a);

        row a=new row(covers[3]);
        appList.add(a);

        row a=new row(covers[4]);
        appList.add(a);

        row a=new row(covers[5]);
        appList.add(a);


        adapter.notifyDataSetChanged();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu); // Fix typo here
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            // Handle action_settings
            return true;
        }
        if (id == R.id.action_search) {
            // Handle action_search
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
