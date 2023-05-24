package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTargetGroup(id: String): CfnTargetGroup = CfnTargetGroup(this, id)

@Generated
public fun Construct.cfnTargetGroup(id: String, initializer: @AwsCdkDsl CfnTargetGroup.() -> Unit):
    CfnTargetGroup = CfnTargetGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnTargetGroup(id: String, props: CfnTargetGroupProps): CfnTargetGroup =
    CfnTargetGroup(this, id, props)

@Generated
public fun Construct.cfnTargetGroup(
  id: String,
  props: CfnTargetGroupProps,
  initializer: @AwsCdkDsl CfnTargetGroup.() -> Unit,
): CfnTargetGroup = CfnTargetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTargetGroup(id: String, initializer: @AwsCdkDsl
    CfnTargetGroup.Builder.() -> Unit): CfnTargetGroup = CfnTargetGroup.Builder.create(this,
    id).apply(initializer).build()
