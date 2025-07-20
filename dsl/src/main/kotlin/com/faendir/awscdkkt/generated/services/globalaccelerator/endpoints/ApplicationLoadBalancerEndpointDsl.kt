package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint

@Generated
public fun buildApplicationLoadBalancerEndpoint(loadBalancer: IApplicationLoadBalancer, initializer: @AwsCdkDsl ApplicationLoadBalancerEndpoint.Builder.() -> Unit = {}): ApplicationLoadBalancerEndpoint = ApplicationLoadBalancerEndpoint.Builder.create(loadBalancer).apply(initializer).build()
