package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun queueConfigurationProperty(initializer: CfnBucket.QueueConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.QueueConfigurationProperty =
    CfnBucket.QueueConfigurationProperty.builder().apply(initializer).build()
