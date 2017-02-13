package com.geniusnine.android.musicalinstruments;
//calling musical instruments names
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import  com.geniusnine.android.musicalinstruments.Instruments.MusicInstruweb;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
ListView MusicListview;
    ArrayAdapter<String> adapter;
    String musiclist[]={"Sitar","Dilruba","Tabla","Santoor","Tanpura","Sarod","Harmonium","Swarmandal","Bansuri","Sarangi","Pakhwaj","Shehnai","Thavil","Veena",
                        "Nadaswaram","Khanjira","Morsing","SruthiBox","flute","Tambura","Mridangam","violin","Ghatam","Tumbi","Bassoon","Piano","Saxaphones","Djembe",
                        "Clarinet","Electric Guitar","Snare Drum","Chimes","Tubular Bells","Marimba","Trombone","Trumpet","Guitar","Banjo","Oboe","Cello","French Horn","dholak",
                       "Pungi","Tambourine","Xylophone","Maraca","Harp","Pan Flute","Tassa","Tun Tuna","Mouth Organ","Agung a tamlang","Balafon","Castanets","Clapstick",
                       "Glockenspiel","Handpan","Mbira","Triangle","Wood block","Agida","Cuica","Dabakan","Drum kit","HomeMade Instruments"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MusicListview = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.content_main, R.id.textView2, musiclist);
        MusicListview.setAdapter(adapter);
        MusicListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent MemRef = new Intent(MainActivity.this, MusicInstruweb.class);
                MemRef.putExtra("key", position);
                startActivity(MemRef);

            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();

                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.nav_share1) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "message to share");
            startActivity(Intent.createChooser(i, "Share via"));
            return true;
        }

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent i = new Intent(MainActivity.this, Intro.class);
            startActivity(i);
        }else
            if (id == R.id.nav_manage) {
                Intent homeref = new Intent(MainActivity.this, HomeMade.class);
                startActivity(homeref);
                // Handle the camera action
            }else if(id==R.id.nav_play){
                Intent homeref = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=musical+instruments+play+youtube"));
                startActivity(homeref);
            // Handle the camera action
        }else if(id==R.id.nav_buy){
                Intent homeref = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=list+of+musical+instrumentss"));
                startActivity(homeref);
                // Handle the camera action
            }
            else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
