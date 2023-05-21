package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun hlsCdnSettingsProperty(initializer: CfnChannel.HlsCdnSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.HlsCdnSettingsProperty =
    CfnChannel.HlsCdnSettingsProperty.builder().apply(initializer).build()
