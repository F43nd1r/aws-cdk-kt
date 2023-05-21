package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun s3ActionProperty(initializer: CfnTopicRule.S3ActionProperty.Builder.() -> Unit = {}):
    CfnTopicRule.S3ActionProperty =
    CfnTopicRule.S3ActionProperty.builder().apply(initializer).build()
