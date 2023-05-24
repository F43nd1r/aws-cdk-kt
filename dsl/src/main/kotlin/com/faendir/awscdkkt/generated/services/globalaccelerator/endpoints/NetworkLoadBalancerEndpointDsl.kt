package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps

@Generated
public fun networkLoadBalancerEndpoint(loadBalancer: INetworkLoadBalancer):
    NetworkLoadBalancerEndpoint = NetworkLoadBalancerEndpoint(loadBalancer)

@Generated
public fun networkLoadBalancerEndpoint(loadBalancer: INetworkLoadBalancer,
    options: NetworkLoadBalancerEndpointProps): NetworkLoadBalancerEndpoint =
    NetworkLoadBalancerEndpoint(loadBalancer, options)

@Generated
public fun buildNetworkLoadBalancerEndpoint(loadBalancer: INetworkLoadBalancer,
    initializer: @AwsCdkDsl NetworkLoadBalancerEndpoint.Builder.() -> Unit):
    NetworkLoadBalancerEndpoint =
    NetworkLoadBalancerEndpoint.Builder.create(loadBalancer).apply(initializer).build()
