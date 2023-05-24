package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScalableTarget(id: String, props: CfnScalableTargetProps): CfnScalableTarget
    = CfnScalableTarget(this, id, props)

@Generated
public fun Construct.cfnScalableTarget(
  id: String,
  props: CfnScalableTargetProps,
  initializer: @AwsCdkDsl CfnScalableTarget.() -> Unit,
): CfnScalableTarget = CfnScalableTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScalableTarget(id: String, initializer: @AwsCdkDsl
    CfnScalableTarget.Builder.() -> Unit): CfnScalableTarget =
    CfnScalableTarget.Builder.create(this, id).apply(initializer).build()
