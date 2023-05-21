package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig

@Generated
public
    fun kinesisStreamConfigProperty(initializer: CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder.() -> Unit
    = {}): CfnRealtimeLogConfig.KinesisStreamConfigProperty =
    CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder().apply(initializer).build()
