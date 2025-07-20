package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.RealtimeLogConfig
import software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps
import software.constructs.Construct

@Generated
public fun Construct.realtimeLogConfig(
  id: String,
  props: RealtimeLogConfigProps,
  initializer: @AwsCdkDsl RealtimeLogConfig.() -> Unit = {},
): RealtimeLogConfig = RealtimeLogConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRealtimeLogConfig(id: String, initializer: @AwsCdkDsl RealtimeLogConfig.Builder.() -> Unit = {}): RealtimeLogConfig = RealtimeLogConfig.Builder.create(this, id).apply(initializer).build()
