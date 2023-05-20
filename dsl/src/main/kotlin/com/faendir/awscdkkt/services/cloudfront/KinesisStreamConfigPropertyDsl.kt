@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig

public
    fun kinesisStreamConfigProperty(initializer: CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder.() -> Unit):
    CfnRealtimeLogConfig.KinesisStreamConfigProperty =
    CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder().apply(initializer).build()
