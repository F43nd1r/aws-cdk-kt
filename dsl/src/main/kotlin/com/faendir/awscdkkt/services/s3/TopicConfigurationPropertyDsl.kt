package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun topicConfigurationProperty(initializer: CfnBucket.TopicConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.TopicConfigurationProperty =
    CfnBucket.TopicConfigurationProperty.builder().apply(initializer).build()
