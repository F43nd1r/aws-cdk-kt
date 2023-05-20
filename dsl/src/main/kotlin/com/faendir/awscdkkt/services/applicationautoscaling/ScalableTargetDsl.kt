@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.constructs.Construct

public fun Construct.scalableTarget(
  id: String,
  props: ScalableTargetProps,
  initializer: ScalableTarget.() -> Unit = {},
): ScalableTarget = ScalableTarget(this, id, props).apply(initializer)
