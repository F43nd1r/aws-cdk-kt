@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps
import software.constructs.Construct

public fun Construct.cfnRealtimeLogConfig(
  id: String,
  props: CfnRealtimeLogConfigProps,
  initializer: CfnRealtimeLogConfig.() -> Unit = {},
): CfnRealtimeLogConfig = CfnRealtimeLogConfig(this, id, props).apply(initializer)
