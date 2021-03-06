/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.haarman.listviewanimations.animationinexamples;

import android.os.Bundle;
import android.widget.BaseAdapter;

import com.haarman.listviewanimations.MyListActivity;
import com.haarman.listviewanimations.adapter.prepared.SwingLeftInAnimationAdapter;

public class SwingLeftInActivity extends MyListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		BaseAdapter mAdapter = createListAdapter();

		SwingLeftInAnimationAdapter swingLeftInAnimationAdapter = new SwingLeftInAnimationAdapter(mAdapter);
		swingLeftInAnimationAdapter.setListView(getListView());

		getListView().setAdapter(swingLeftInAnimationAdapter);
	}
}
