package com.faendir.awscdkkt.services.mediatailor

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@Generated
public
    fun cdnConfigurationProperty(initializer: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder.() -> Unit
    = {}): CfnPlaybackConfiguration.CdnConfigurationProperty =
    CfnPlaybackConfiguration.CdnConfigurationProperty.builder().apply(initializer).build()
