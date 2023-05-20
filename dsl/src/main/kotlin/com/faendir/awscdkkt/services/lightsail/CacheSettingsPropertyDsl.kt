@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDistribution

public
    fun cacheSettingsProperty(initializer: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit):
    CfnDistribution.CacheSettingsProperty =
    CfnDistribution.CacheSettingsProperty.builder().apply(initializer).build()
