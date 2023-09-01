package com.faendir.awscdkkt.generated.services.elasticloadbalancing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.loadBalancer(
  id: String,
  props: LoadBalancerProps,
  initializer: @AwsCdkDsl LoadBalancer.() -> Unit = {},
): LoadBalancer = LoadBalancer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLoadBalancer(id: String, initializer: @AwsCdkDsl
    LoadBalancer.Builder.() -> Unit = {}): LoadBalancer = LoadBalancer.Builder.create(this,
    id).apply(initializer).build()
