@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun eventBridgeConfigurationProperty(initializer: CfnBucket.EventBridgeConfigurationProperty.Builder.() -> Unit):
    CfnBucket.EventBridgeConfigurationProperty =
    CfnBucket.EventBridgeConfigurationProperty.builder().apply(initializer).build()
