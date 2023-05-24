package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.networkTargetGroup(id: String, props: NetworkTargetGroupProps):
    NetworkTargetGroup = NetworkTargetGroup(this, id, props)

@Generated
public fun Construct.networkTargetGroup(
  id: String,
  props: NetworkTargetGroupProps,
  initializer: @AwsCdkDsl NetworkTargetGroup.() -> Unit,
): NetworkTargetGroup = NetworkTargetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkTargetGroup(id: String, initializer: @AwsCdkDsl
    NetworkTargetGroup.Builder.() -> Unit): NetworkTargetGroup =
    NetworkTargetGroup.Builder.create(this, id).apply(initializer).build()
