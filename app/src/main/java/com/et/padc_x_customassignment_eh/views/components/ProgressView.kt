package com.et.padc_x_customassignment_eh.views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.et.padc_x_customassignment_eh.R

class ProgressView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint3 = Paint(Paint.ANTI_ALIAS_FLAG)
    private var borderWidth = DEFAULT_BORDER_WIDTH

    override fun onDraw(canvas: Canvas) {
        drawBackgorund(canvas)
        drawText(canvas)
        super.onDraw(canvas)

    }

    private fun drawBackgorund(canvas: Canvas){
        val radius = width / 2f

        paint1.color = Color.RED
        paint1.strokeWidth = 4.0f
        paint1.style = Paint.Style.STROKE
        canvas.drawCircle(width / 2f, width / 2f, radius - borderWidth / 2f, paint1)

    }

    private fun drawText(canvas: Canvas){
        paint1.color = Color.RED
        paint2.strokeWidth = 20f
        paint1.style = Paint.Style.FILL
        canvas.drawText("85%", 5f, width/2f, paint2)
    }

    // 1
    companion object {

        private const val DEFAULT_FACE_COLOR = Color.YELLOW
        private const val DEFAULT_EYES_COLOR = Color.BLACK
        private const val DEFAULT_MOUTH_COLOR = Color.BLACK
        private const val DEFAULT_BORDER_COLOR = Color.BLACK
        private const val DEFAULT_BORDER_WIDTH = 4.0f

        const val HAPPY = 0L
        const val SAD = 1L
    }
}