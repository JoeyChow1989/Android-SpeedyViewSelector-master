/**
 * <pre>
 * Copyright 2015 Soulwolf Ching
 * Copyright 2015 The Android Open Source Project for Android-SpeedyViewSelector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.widget.speedyselector.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RadioButton;

import net.soulwolf.widget.speedyselector.SpeedySelectorDelegate;
import net.soulwolf.widget.speedyselector.StateType;
import net.soulwolf.widget.speedyselector.internal.GeneralSelector;

/**
 * author: Soulwolf Created on 2015/8/9 15:42.
 * email : Ching.Soulwolf@gmail.com
 */
public class SelectorRadioButton extends RadioButton implements GeneralSelector{

    SpeedySelectorDelegate mSpeedySelectorDelegate;

    public SelectorRadioButton(Context context) {
        super(context);
        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this);
    }

    public SelectorRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs);
    }

    public SelectorRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SelectorRadioButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void addStateBackground(StateType state, Drawable drawable) {
        mSpeedySelectorDelegate.addStateBackground(state,drawable);
    }

    @Override
    public void addStateBackgroundResource(StateType state, @DrawableRes int draRes) {
        mSpeedySelectorDelegate.addStateBackgroundResource(state, draRes);
    }

    @Override
    public void addStateBackground(StateType state, float radius, @ColorInt int color) {
        mSpeedySelectorDelegate.addStateBackground(state,radius,color);
    }

    @Override
    public void addStateBackground(StateType state, float radius, boolean justBorder, @ColorInt int color) {
        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,color);
    }

    @Override
    public void addStateBackground(StateType state, float radius, boolean justBorder, float borderWidth, @ColorInt int color) {
        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,borderWidth,color);
    }

    @Override
    public void addStateBackgroundResource(StateType state, float radius, @ColorRes int colorRes) {
        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,colorRes);
    }

    @Override
    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, @ColorRes int colorRes) {
        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,colorRes);
    }

    @Override
    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, float borderWidth, @ColorRes int colorRes) {
        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,borderWidth,colorRes);
    }

    @Override
    public void setTextColorResource(@ColorRes int resId) {
        mSpeedySelectorDelegate.setTextColorRessource(resId);
    }

    @Override
    public void addTextStateColor(StateType state, @ColorInt int color) {
        mSpeedySelectorDelegate.addTextStateColor(state,color);
    }

    @Override
    public void addTextStateColorResource(StateType state, @ColorRes int colorRes) {
        mSpeedySelectorDelegate.addTextStateColorRessource(state, colorRes);
    }

    @Override
    public void requestSelector() {
        mSpeedySelectorDelegate.requestSelector();
    }
}
