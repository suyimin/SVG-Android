package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_star_half extends SVGRenderer {

    public ic_star_half(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(22.0f, 9.24f);
        mPath.rLineTo(-7.19f, -0.62f);
        mPath.lineTo(12.0f, 2.0f);
        mPath.lineTo(9.19f, 8.63f);
        mPath.lineTo(2.0f, 9.24f);
        mPath.rLineTo(5.46f, 4.73f);
        mPath.lineTo(5.82f, 21.0f);
        mPath.lineTo(12.0f, 17.27f);
        mPath.lineTo(18.18f, 21.0f);
        mPath.rLineTo(-1.63f, -7.03f);
        mPath.lineTo(22.0f, 9.24f);
        mPath.close();
        mPath.moveTo(22.0f, 9.24f);
        mPath.moveTo(12.0f, 15.4f);
        mPath.lineTo(12.0f, 6.1f);
        mPath.rLineTo(1.71f, 4.04f);
        mPath.rLineTo(4.38f, 0.38f);
        mPath.rLineTo(-3.32f, 2.88f);
        mPath.rLineTo(1.0f, 4.28f);
        mPath.lineTo(12.0f, 15.4f);
        mPath.close();
        mPath.moveTo(12.0f, 15.4f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}