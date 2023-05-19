@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDistribution

public
    fun cacheSettingsProperty(initializer: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit):
    CfnDistribution.CacheSettingsProperty =
    CfnDistribution.CacheSettingsProperty.builder().apply(initializer).build()
