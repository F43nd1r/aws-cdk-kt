package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutoScalingGroup(id: String, props: CfnAutoScalingGroupProps):
    CfnAutoScalingGroup = CfnAutoScalingGroup(this, id, props)

@Generated
public fun Construct.cfnAutoScalingGroup(
  id: String,
  props: CfnAutoScalingGroupProps,
  initializer: @AwsCdkDsl CfnAutoScalingGroup.() -> Unit,
): CfnAutoScalingGroup = CfnAutoScalingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutoScalingGroup(id: String, initializer: @AwsCdkDsl
    CfnAutoScalingGroup.Builder.() -> Unit): CfnAutoScalingGroup =
    CfnAutoScalingGroup.Builder.create(this, id).apply(initializer).build()
