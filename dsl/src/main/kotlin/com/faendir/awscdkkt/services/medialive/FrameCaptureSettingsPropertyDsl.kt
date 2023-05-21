package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun frameCaptureSettingsProperty(initializer: CfnChannel.FrameCaptureSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.FrameCaptureSettingsProperty =
    CfnChannel.FrameCaptureSettingsProperty.builder().apply(initializer).build()
