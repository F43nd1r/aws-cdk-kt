package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnRealtimeLogConfig.() -> Unit = {},
): CfnRealtimeLogConfig = CfnRealtimeLogConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRealtimeLogConfig(id: String, initializer: @AwsCdkDsl
    CfnRealtimeLogConfig.Builder.() -> Unit = {}): CfnRealtimeLogConfig =
    CfnRealtimeLogConfig.Builder.create(this, id).apply(initializer).build()
