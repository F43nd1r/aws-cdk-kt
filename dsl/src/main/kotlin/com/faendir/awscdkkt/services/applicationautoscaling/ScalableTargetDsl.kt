package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.constructs.Construct

@Generated
public fun Construct.scalableTarget(
  id: String,
  props: ScalableTargetProps,
  initializer: ScalableTarget.() -> Unit = {},
): ScalableTarget = ScalableTarget(this, id, props).apply(initializer)
