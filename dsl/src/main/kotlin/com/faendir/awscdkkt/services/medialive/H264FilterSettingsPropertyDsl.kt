package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun h264FilterSettingsProperty(initializer: CfnChannel.H264FilterSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.H264FilterSettingsProperty =
    CfnChannel.H264FilterSettingsProperty.builder().apply(initializer).build()
