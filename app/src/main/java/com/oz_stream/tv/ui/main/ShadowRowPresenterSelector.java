/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.oz_stream.tv.ui.main;


import android.graphics.Movie;

import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;

import com.oz_stream.tv.data.models.Root;

/**
 * This {@link PresenterSelector} will return a {@link ListRowPresenter} which has shadow support
 * enabled or not depending on {@link CardRow#useShadow()} for a given row.
 */
public class ShadowRowPresenterSelector extends PresenterSelector {

    private ListRowPresenter mShadowEnabledRowPresenter = new ListRowPresenter();
    private ListRowPresenter mShadowDisabledRowPresenter = new ListRowPresenter();

    public ShadowRowPresenterSelector() {
        mShadowEnabledRowPresenter.setNumRows(1);
        mShadowDisabledRowPresenter.setShadowEnabled(false);
    }

    @Override
    public Presenter getPresenter(Object item) {
        if (!(item instanceof CardListRow)) return mShadowDisabledRowPresenter;
        CardListRow listRow = (CardListRow) item;
        Root row = listRow.getmCardRow();
        return mShadowEnabledRowPresenter;
    }

    @Override
    public Presenter[] getPresenters() {
        return new Presenter [] {
                mShadowDisabledRowPresenter,
                mShadowEnabledRowPresenter
        };
    }
}
