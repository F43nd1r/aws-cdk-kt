package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScalableTarget(
  id: String,
  props: CfnScalableTargetProps,
  initializer: CfnScalableTarget.() -> Unit = {},
): CfnScalableTarget = CfnScalableTarget(this, id, props).apply(initializer)
