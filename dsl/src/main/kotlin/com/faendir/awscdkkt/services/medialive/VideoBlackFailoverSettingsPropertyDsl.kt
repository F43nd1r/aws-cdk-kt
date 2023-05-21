package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun videoBlackFailoverSettingsProperty(initializer: CfnChannel.VideoBlackFailoverSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.VideoBlackFailoverSettingsProperty =
    CfnChannel.VideoBlackFailoverSettingsProperty.builder().apply(initializer).build()
