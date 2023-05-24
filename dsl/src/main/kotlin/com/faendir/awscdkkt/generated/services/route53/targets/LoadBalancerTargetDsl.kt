package com.faendir.awscdkkt.generated.services.route53.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
import software.amazon.awscdk.services.route53.targets.LoadBalancerTarget

@Generated
public fun loadBalancerTarget(loadBalancer: ILoadBalancerV2): LoadBalancerTarget =
    LoadBalancerTarget(loadBalancer)
