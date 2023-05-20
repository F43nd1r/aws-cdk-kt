@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun loggingConfigurationProperty(initializer: CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit):
    CfnBucket.LoggingConfigurationProperty =
    CfnBucket.LoggingConfigurationProperty.builder().apply(initializer).build()
