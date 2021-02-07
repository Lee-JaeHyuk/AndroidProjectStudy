package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list01);

        String[] values = {"Apple", "Apricot", "Avocado", "Banana", "BlackBerry", "BlueBarry", "Cherry",
                "Coconut", "CranBerry", "Graph Raisin", "Honeydew", "Jackfruit", "Lemon", "Lime", "Mango", "Watermelon"};
        MyAdapter adapter = new MyAdapter(this,values);

        list.setAdapter(adapter);

    }
    class MyAdapter extends BaseAdapter{

        private final Context context;
        private final String[] values;

        public MyAdapter(Context context, String[] values){
            this.context = context;
            this.values = values;
        }
        @Override
        public int getCount() {
            return values.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = inflater.inflate(R.layout.list_item, parent, false);
            TextView textView = (TextView) itemView.findViewById(R.id.label);
            textView.setText(values[position]);
            String s = values[position];
            return itemView;
        }
    }
}
