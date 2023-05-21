package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@Generated
public
    fun sseConfigurationProperty(initializer: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit
    = {}): CfnFHIRDatastore.SseConfigurationProperty =
    CfnFHIRDatastore.SseConfigurationProperty.builder().apply(initializer).build()
