package jp.pxv.android.dailyreportchecker

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class MainActivity extends ActionBarActivity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  override def onCreateOptionsMenu(menu: Menu): boolean = {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  override def onOptionsItemSelected(item: MenuItem): boolean = {
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
}
