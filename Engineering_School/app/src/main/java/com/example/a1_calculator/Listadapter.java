package com.example.a1_calculator;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ListAdapter extends BaseAdapter
{
    LayoutInflater inflater = null;

    String name;
    String number;
    private ArrayList<myuser> m_data = null;
    private int m_count = 0;

    public ListAdapter(ArrayList<myuser> _data, Context context)
    {
        m_data = _data;
        m_count = m_data.size();
    }

    @Override
    public int getCount()
    {
        Log.i("TAG", "getCount");
        return m_count;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            final Context context = parent.getContext();
            if (inflater == null)
            {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.item_view, parent, false);
        }

        TextView oTextTitle = (TextView) convertView.findViewById(R.id.tv_name);
        TextView oTextDate = (TextView) convertView.findViewById(R.id.tv_detail);

        oTextTitle.setText(m_data.get(position).name);
        oTextDate.setText(m_data.get(position).num);
        return convertView;
    }
}
