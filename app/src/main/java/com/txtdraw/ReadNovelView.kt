package com.txtdraw

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class ReadNovelView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    private var textSize: Float = 20f

    fun setTextSize(textsize: Float) {
        this.textSize = textSize
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        paint.color = Color.GREEN
        paint.textSize = textSize
        canvas.drawText("xx", 0f, 120f, paint)
    }
}