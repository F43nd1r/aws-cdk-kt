package com.faendir.awscdkkt.services.mediatailor

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@Generated
public
    fun hlsConfigurationProperty(initializer: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder.() -> Unit
    = {}): CfnPlaybackConfiguration.HlsConfigurationProperty =
    CfnPlaybackConfiguration.HlsConfigurationProperty.builder().apply(initializer).build()
