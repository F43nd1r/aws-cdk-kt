package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ScalableTarget.() -> Unit = {},
): ScalableTarget = ScalableTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScalableTarget(id: String, initializer: @AwsCdkDsl ScalableTarget.Builder.() -> Unit = {}): ScalableTarget = ScalableTarget.Builder.create(this, id).apply(initializer).build()
