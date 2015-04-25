package poipoi.poisoundboard;

import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;


public class MainActivity extends ActionBarActivity {
    private Toast mToast;
    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void poi1(View v){
        playMp3("poi1.mp3");
    }
    public void poi2(View v){
        playMp3("poi2.mp3");
    }
    public void poi3(View v){
        playMp3("poi3.mp3");
    }
    public void poi4(View v){
        playMp3("poi4.mp3");
    }
    public void poi5(View v){
        playMp3("poi5.mp3");
    }
    public void poi6(View v){
        playMp3("poi6.mp3");
    }
    public void poi7(View v){
        playMp3("poi7.mp3");
    }
    public void poi8(View v){
        playMp3("poi8.mp3");
    }
    public void poi9(View v){
        playMp3("poi9.mp3");
    }
    public void poi10(View v){
        playMp3("poi10.mp3");
    }
    public void poi11(View v){
        playMp3("poi11.mp3");
    }
    public void poi12(View v){
        playMp3("poi12.mp3");
    }
    public void poi13(View v){
        playMp3("poi13.mp3");
    }
    public void poi14(View v){
        playMp3("poi14.mp3");
    }
    public void poi15(View v){
        playMp3("poi15.mp3");
    }
    public void poi16(View v){
        playMp3("poi16.mp3");
    }public void poi17(View v){
        playMp3("poi17.mp3");
    }
    public void poi18(View v){
        playMp3("poi18.mp3");
    }
    public void poi19(View v){
        playMp3("poi19.mp3");
    }
    public void poi20(View v){
        playMp3("poi20.mp3");
    }
    public void poi21(View v){
        playMp3("poi21.mp3");
    }
    public void poi22(View v){
        playMp3("poi22.mp3");
    }
    public void poi23(View v){
        playMp3("poi23.mp3");
    }
    public void poi24(View v){
        playMp3("poi24.mp3");
    }public void poi25(View v){
        playMp3("poi25.mp3");
    }
    public void poi26(View v){
        playMp3("poi26.mp3");
    }
    public void poi27(View v){
        playMp3("poi27.mp3");
    }
    public void poi28(View v){
        playMp3("poi28.mp3");
    }
    public void poi29(View v){
        playMp3("poi29.mp3");
    }
    public void poi30(View v){
        playMp3("poi30.mp3");
    }
    public void poi31(View v){
        playMp3("poi31.mp3");
    }
    public void poi32(View v){
        playMp3("poi32.mp3");
    }public void poi33(View v){
        playMp3("poi33.mp3");
    }
    public void poi34(View v){
        playMp3("poi34.mp3");
    }
    public void poi35(View v){
        playMp3("poi35.mp3");
    }
    public void poi36(View v){
        playMp3("poi36.mp3");
    }
    public void poi37(View v){
        playMp3("poi37.mp3");
    }
    public void poi38(View v){
        playMp3("poi38.mp3");
    }
    public void poi39(View v){
        playMp3("poi39.mp3");
    }
    public void poi40(View v){
        playMp3("poi40.mp3");
    }


    void playMp3(String str){
        if(mp.isPlaying())
            mp.stop();
        try {
            mp.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(str);
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        }
        catch(FileNotFoundException e){
            showToast("file not found");
        }
        catch(IOException e){
            showToast("rip");
        }
    }

    private void showToast(String text) {
        if (mToast == null) {
            mToast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }
}
