package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.amazon.awscdk.services.autoscaling.WarmPoolProps
import software.constructs.Construct

@Generated
public fun Construct.warmPool(
  id: String,
  props: WarmPoolProps,
  initializer: @AwsCdkDsl WarmPool.() -> Unit = {},
): WarmPool = WarmPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWarmPool(id: String, initializer: @AwsCdkDsl WarmPool.Builder.() -> Unit = {}): WarmPool = WarmPool.Builder.create(this, id).apply(initializer).build()
