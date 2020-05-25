package com.storifyme.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.storifyme.widget.WidgetComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addDefaultSizeWidget()
        addCustomSizeWidget()
    }

    private fun addDefaultSizeWidget() {
        val widgetId = "31"
        val firstWidget = WidgetComponent.newInstance(widgetId)
        // 220x220 default size
        supportFragmentManager.beginTransaction()
            .add(R.id.defaultSizeWidgetContainer, firstWidget)
            .commit()
    }

    private fun addCustomSizeWidget() {
        val widgetId = "5628"
        val secondWidget = WidgetComponent.newInstance(widgetId)
        secondWidget.setItemSize(280, 280) // override size
        supportFragmentManager.beginTransaction()
            .add(R.id.customSizeWidgetContainer, secondWidget)
            .commit()
    }
}
