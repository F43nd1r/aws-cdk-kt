package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun wavSettingsProperty(initializer: CfnChannel.WavSettingsProperty.Builder.() -> Unit = {}):
    CfnChannel.WavSettingsProperty =
    CfnChannel.WavSettingsProperty.builder().apply(initializer).build()
