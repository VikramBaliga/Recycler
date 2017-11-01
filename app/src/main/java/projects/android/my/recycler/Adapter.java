package projects.android.my.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 01-11-2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    private List<AndroidVersion> listItems;
    private Context context;

    public Adapter(List<AndroidVersion> listItems,Context context)
    {
        this.listItems=listItems;
        this.context=context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_views,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        AndroidVersion version = listItems.get(position);

        holder.header.setText(version.getName());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView header;


        public ViewHolder(View itemView) {
            super(itemView);
            header=(TextView)itemView.findViewById(R.id.Heading);

        }
    }
}
