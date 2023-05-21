package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun eventBridgeConfigurationProperty(initializer: CfnBucket.EventBridgeConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.EventBridgeConfigurationProperty =
    CfnBucket.EventBridgeConfigurationProperty.builder().apply(initializer).build()
