@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

public
    fun sseConfigurationProperty(initializer: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit):
    CfnFHIRDatastore.SseConfigurationProperty =
    CfnFHIRDatastore.SseConfigurationProperty.builder().apply(initializer).build()
