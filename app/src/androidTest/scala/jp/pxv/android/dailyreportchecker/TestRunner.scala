package jp.pxv.android.dailyreportchecker

import android.os.Bundle
import android.support.multidex.MultiDex
import android.support.test.runner.AndroidJUnitRunner

class TestRunner extends AndroidJUnitRunner {
  override def onCreate(arguments: Bundle): Unit = {
    MultiDex.install(getTargetContext)
    super.onCreate(arguments)
  }
}
