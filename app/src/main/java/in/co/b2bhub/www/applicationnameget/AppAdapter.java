package in.co.b2bhub.www.applicationnameget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by B2B Android on 3/24/2017.
 */

public class AppAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Applist> listStorage;
    public AppAdapter(Context context, List<Applist> customizedListView) {
        layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }


    @Override
    public int getCount() {
        return  listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder listViewHolder;
        if(convertView == null){
            listViewHolder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.row_layout, parent, false);

            listViewHolder.textInListView = (TextView)convertView.findViewById(R.id.list_app_name);
            listViewHolder.imageInListView = (ImageView)convertView.findViewById(R.id.app_icon);
            listViewHolder.textpkg=(TextView)convertView.findViewById(R.id.list_pkg_name);
            listViewHolder.txtdate=(TextView)convertView.findViewById(R.id.list_date_name);
            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder)convertView.getTag();
        }
        listViewHolder.textInListView.setText(listStorage.get(position).getName());
        listViewHolder.textpkg.setText(listStorage.get(position).getPname());
        listViewHolder.imageInListView.setImageDrawable(listStorage.get(position).getIcon());
        listViewHolder.txtdate.setText(listStorage.get(position).getDate());

        return convertView;

    }
    static class ViewHolder{

        TextView textInListView,textpkg,txtdate;
        ImageView imageInListView;
    }
}
