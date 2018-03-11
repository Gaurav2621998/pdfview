/*
 * Copyright (C) 2016 Olmo Gallegos Hernández.
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
package es.voghdev.pdfviewpager.sample;

import android.support.test.InstrumentationRegistry;

import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;

public abstract class BaseTest {

    protected void openActionBarMenu() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
    }
}
