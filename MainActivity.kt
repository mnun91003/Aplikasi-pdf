
package com.example.pdfviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pdfView: PDFView = findViewById(R.id.pdfView)
        pdfView.fromAsset("sample.pdf").enableSwipe(true).load()
    }
}
