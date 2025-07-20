package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoadBalancer(id: String, initializer: @AwsCdkDsl CfnLoadBalancer.() -> Unit = {}): CfnLoadBalancer = CfnLoadBalancer(this, id).apply(initializer)

@Generated
public fun Construct.cfnLoadBalancer(
  id: String,
  props: CfnLoadBalancerProps,
  initializer: @AwsCdkDsl CfnLoadBalancer.() -> Unit = {},
): CfnLoadBalancer = CfnLoadBalancer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoadBalancer(id: String, initializer: @AwsCdkDsl CfnLoadBalancer.Builder.() -> Unit = {}): CfnLoadBalancer = CfnLoadBalancer.Builder.create(this, id).apply(initializer).build()
