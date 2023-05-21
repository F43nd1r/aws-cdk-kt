package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig

@Generated
public fun endPointProperty(initializer: CfnRealtimeLogConfig.EndPointProperty.Builder.() -> Unit =
    {}): CfnRealtimeLogConfig.EndPointProperty =
    CfnRealtimeLogConfig.EndPointProperty.builder().apply(initializer).build()
