package com.sweedelight.ganesh.sweedelight.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.sweedelight.ganesh.sweedelight.R;

import java.util.ArrayList;
import java.util.List;

public class Categories extends AppCompatActivity {
    private List<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager mLinearLayoutManager= new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        initializeData();
        CustomAdapter adapter= new CustomAdapter(categories);
        mRecyclerView.setAdapter(adapter);
//        final CardView cardView = (CardView) findViewById(R.id.card_view_category);
  //      cardView.setOnClickListener(new View.OnClickListener() {
    //        @Override

      //      public void onClick(View v) {
        //        v.getContext().startActivity(new Intent(v.getContext(), Sweets.class));
          //  }
        //});


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void initializeData() {
        categories = new ArrayList<>();
        categories.add(new Category("Sweets", R.drawable.metro));
        categories.add(new Category("Savouries", R.drawable.metro));
        categories.add(new Category("Cakes", R.drawable.metro));
        categories.add(new Category("Snacks", R.drawable.metro));
        categories.add(new Category("Finedine", R.drawable.metro));
        categories.add(new Category("Dryfruits", R.drawable.metro));
    }


}
class Category {
    String name;
    int photoId;

    Category(String name, int photoId) {
        this.name = name;
        this.photoId = photoId;
    }
}