package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun outputSettingsProperty(initializer: CfnChannel.OutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.OutputSettingsProperty =
    CfnChannel.OutputSettingsProperty.builder().apply(initializer).build()
