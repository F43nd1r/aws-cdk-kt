package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.autoScalingGroup(
  id: String,
  props: AutoScalingGroupProps,
  initializer: @AwsCdkDsl AutoScalingGroup.() -> Unit = {},
): AutoScalingGroup = AutoScalingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAutoScalingGroup(id: String, initializer: @AwsCdkDsl AutoScalingGroup.Builder.() -> Unit = {}): AutoScalingGroup = AutoScalingGroup.Builder.create(this, id).apply(initializer).build()
