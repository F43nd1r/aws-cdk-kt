@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.constructs.Construct

public fun Construct.lifecycleHook(
  id: String,
  props: LifecycleHookProps,
  initializer: LifecycleHook.() -> Unit = {},
): LifecycleHook = LifecycleHook(this, id, props).apply(initializer)
