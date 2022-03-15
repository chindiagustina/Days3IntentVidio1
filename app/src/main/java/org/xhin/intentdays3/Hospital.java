package org.xhin.intentdays3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[]{"RS Santa Maria","RS Awal Bros","RS Eka Hospital","RS Arifin Achmad"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospital));
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
            if (option.equals("RS Santa Maria")){
                x = new Intent(this,RsSantaMaria.class);
            } else if(option.equals("RS Eka Hospital")) {
                x = new Intent(this, RsEkaHospital.class);
            }else if(option.equals("RS Awal Bros")){
                x = new Intent(this,RsAwalBros.class);
            }else if(option.equals("RS Arifin Achmad")){
                x = new Intent(this,RsArifinAchmad.class);
            }
            startActivity(x);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
