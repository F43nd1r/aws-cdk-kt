package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.constructs.Construct

@Generated
public fun Construct.lifecycleHook(
  id: String,
  props: LifecycleHookProps,
  initializer: LifecycleHook.() -> Unit = {},
): LifecycleHook = LifecycleHook(this, id, props).apply(initializer)
