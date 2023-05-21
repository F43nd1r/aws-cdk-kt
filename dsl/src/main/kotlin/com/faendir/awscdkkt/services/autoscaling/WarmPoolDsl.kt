package com.faendir.awscdkkt.services.autoscaling

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
  initializer: WarmPool.() -> Unit = {},
): WarmPool = WarmPool(this, id, props).apply(initializer)
