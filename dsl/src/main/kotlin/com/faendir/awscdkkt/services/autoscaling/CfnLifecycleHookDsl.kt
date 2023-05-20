@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
import software.constructs.Construct

public fun Construct.cfnLifecycleHook(
  id: String,
  props: CfnLifecycleHookProps,
  initializer: CfnLifecycleHook.() -> Unit = {},
): CfnLifecycleHook = CfnLifecycleHook(this, id, props).apply(initializer)
