package jp.pxv.android.dailyreportchecker

import android.app.Application
import android.test.ApplicationTestCase
import org.junit.Assert

class ApplicationTest extends ApplicationTestCase[Application](classOf[Application]) {
  def testFoo(): Unit = {
    Assert.assertTrue(true)
  }
}
