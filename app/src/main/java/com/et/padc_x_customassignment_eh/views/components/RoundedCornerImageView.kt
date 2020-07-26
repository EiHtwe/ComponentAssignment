package com.et.padc_x_customassignment_eh.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.et.padc_x_customassignment_eh.R

class RoundedCornerImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var borderColor =
        DEFAULT_BORDER_COLOR

    // Face border width in pixels
    private var borderWidth =
        DEFAULT_BORDER_WIDTH

    private var cornerRadius = 20f
    private var size = 0

    private val path = Path()

    init {

        context.withStyledAttributes(attrs, R.styleable.RoundedCornerImageView) {
            cornerRadius = getDimension(R.styleable.RoundedCornerImageView_cornerRadius, cornerRadius)

        }
    }

    override fun onDraw(canvas: Canvas) {

        drawStroke(canvas)
        //drawRoundImage(canvas)
        setRound(canvas)
        super.onDraw(canvas)
    }

    fun drawStroke(canvas: Canvas?) {

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        val radius = width / 2f

        /* Border paint */
        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth
        canvas?.drawCircle(width / 2f, width / 2f, radius - borderWidth / 2f, paint)
    }

    private fun setRound(canvas: Canvas){
        var  roundPx = 10f

        val rectangle = RectF(3f, 3f,  width.toFloat()-3f, height.toFloat()-3f)

        path.addRoundRect(rectangle, cornerRadius, cornerRadius, Path.Direction.CCW)

        canvas.clipPath(path)

    }

    companion object {

        private const val DEFAULT_BORDER_COLOR = Color.WHITE
        private const val DEFAULT_BORDER_WIDTH = 4.0f

    }

}