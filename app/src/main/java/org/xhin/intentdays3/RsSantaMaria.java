package org.xhin.intentdays3;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RsSantaMaria extends ListActivity {
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        String[] listData = new String[]{"Call Center","Customer Service","Direction","Website","Info Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listData));
    }

    protected void onListItemClick(ListView l, View v, int pos, long id){
        super.onListItemClick(l,v,pos,id);
        Object o = this.getListAdapter().getItem(pos);
        String option = o.toString();

        showOption(option);
    }
    

    private void showOption(String option) {
        Intent x = null;
        try{
            if (option.equals("Call Center")){
                String CallCenter = "tel:076122213";
                x = new Intent(Intent.ACTION_DIAL, Uri.parse(CallCenter));
            }else if(option.equals("Customer Service")){
                String word= "Hallo!!";
                x = new Intent(Intent.ACTION_VIEW);
                x.setData(Uri.parse("sms:081268680908"));
                x.putExtra("sms_body",word);

            }else if(option.equals("Direction")){
                String lokasi = "google.navigation:q=0.463823,101.39053";
                x = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasi));

            }else if(option.equals("Website")){
                String website = "https://rssantamariapekanbaru.com";
                x = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            }else if(option.equals("Info Google")){
                x = new Intent(Intent.ACTION_WEB_SEARCH);
                x.putExtra(SearchManager.QUERY,"Rumah Sakit Santa Maria Pekanbaru");

            }else if(option.equals("Exit")){
                x = new Intent(getApplicationContext(), MainActivity.class);

            }
            startActivity(x);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
