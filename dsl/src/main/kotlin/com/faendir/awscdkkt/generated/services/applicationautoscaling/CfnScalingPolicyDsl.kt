package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScalingPolicy(id: String, props: CfnScalingPolicyProps): CfnScalingPolicy =
    CfnScalingPolicy(this, id, props)

@Generated
public fun Construct.cfnScalingPolicy(
  id: String,
  props: CfnScalingPolicyProps,
  initializer: @AwsCdkDsl CfnScalingPolicy.() -> Unit,
): CfnScalingPolicy = CfnScalingPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScalingPolicy(id: String, initializer: @AwsCdkDsl
    CfnScalingPolicy.Builder.() -> Unit): CfnScalingPolicy = CfnScalingPolicy.Builder.create(this,
    id).apply(initializer).build()
