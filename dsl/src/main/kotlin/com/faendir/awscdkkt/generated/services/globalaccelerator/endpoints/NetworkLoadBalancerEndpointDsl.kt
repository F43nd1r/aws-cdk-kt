package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint

@Generated
public fun buildNetworkLoadBalancerEndpoint(loadBalancer: INetworkLoadBalancer, initializer: @AwsCdkDsl NetworkLoadBalancerEndpoint.Builder.() -> Unit = {}): NetworkLoadBalancerEndpoint = NetworkLoadBalancerEndpoint.Builder.create(loadBalancer).apply(initializer).build()
