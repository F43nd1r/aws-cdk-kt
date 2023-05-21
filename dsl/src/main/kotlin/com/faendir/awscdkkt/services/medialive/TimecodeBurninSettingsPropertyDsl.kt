package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun timecodeBurninSettingsProperty(initializer: CfnChannel.TimecodeBurninSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.TimecodeBurninSettingsProperty =
    CfnChannel.TimecodeBurninSettingsProperty.builder().apply(initializer).build()
