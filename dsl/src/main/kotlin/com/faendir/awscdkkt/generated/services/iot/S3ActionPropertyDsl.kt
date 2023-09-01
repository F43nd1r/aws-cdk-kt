package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun buildS3ActionProperty(initializer: @AwsCdkDsl
    CfnTopicRule.S3ActionProperty.Builder.() -> Unit = {}): CfnTopicRule.S3ActionProperty =
    CfnTopicRule.S3ActionProperty.Builder().apply(initializer).build()
