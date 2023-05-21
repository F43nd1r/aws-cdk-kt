package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDistribution

@Generated
public
    fun cacheSettingsProperty(initializer: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit
    = {}): CfnDistribution.CacheSettingsProperty =
    CfnDistribution.CacheSettingsProperty.builder().apply(initializer).build()
