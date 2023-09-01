package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.applicationLoadBalancer(
  id: String,
  props: ApplicationLoadBalancerProps,
  initializer: @AwsCdkDsl ApplicationLoadBalancer.() -> Unit = {},
): ApplicationLoadBalancer = ApplicationLoadBalancer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplicationLoadBalancer(id: String, initializer: @AwsCdkDsl
    ApplicationLoadBalancer.Builder.() -> Unit = {}): ApplicationLoadBalancer =
    ApplicationLoadBalancer.Builder.create(this, id).apply(initializer).build()
