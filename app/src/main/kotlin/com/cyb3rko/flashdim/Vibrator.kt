/*
 * Copyright (c) 2023 Cyb3rKo
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

package com.cyb3rko.flashdim

import android.os.VibrationEffect

internal object Vibrator {
    internal fun vibrate(vibrator: android.os.Vibrator, duration: Long) {
        vibrator.vibrate(
            VibrationEffect.createOneShot(duration, 80)
        )
    }

    internal fun vibrateClick(vibrator: android.os.Vibrator) {
        vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK))
    }

    internal fun vibrateDoubleClick(vibrator: android.os.Vibrator) {
        vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_DOUBLE_CLICK))
    }

    internal fun vibrateTick(vibrator: android.os.Vibrator) {
        vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK))
    }
}
