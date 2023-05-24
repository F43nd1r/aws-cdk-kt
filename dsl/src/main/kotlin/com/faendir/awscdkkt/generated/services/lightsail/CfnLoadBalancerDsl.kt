package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnLoadBalancer
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoadBalancer(id: String, props: CfnLoadBalancerProps): CfnLoadBalancer =
    CfnLoadBalancer(this, id, props)

@Generated
public fun Construct.cfnLoadBalancer(
  id: String,
  props: CfnLoadBalancerProps,
  initializer: @AwsCdkDsl CfnLoadBalancer.() -> Unit,
): CfnLoadBalancer = CfnLoadBalancer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoadBalancer(id: String, initializer: @AwsCdkDsl
    CfnLoadBalancer.Builder.() -> Unit): CfnLoadBalancer = CfnLoadBalancer.Builder.create(this,
    id).apply(initializer).build()
