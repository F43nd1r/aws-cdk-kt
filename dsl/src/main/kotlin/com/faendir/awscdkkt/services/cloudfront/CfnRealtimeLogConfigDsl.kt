package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRealtimeLogConfig(
  id: String,
  props: CfnRealtimeLogConfigProps,
  initializer: CfnRealtimeLogConfig.() -> Unit = {},
): CfnRealtimeLogConfig = CfnRealtimeLogConfig(this, id, props).apply(initializer)
