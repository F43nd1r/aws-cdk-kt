package com.faendir.awscdkkt.generated.services.route53.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.route53.targets.ClassicLoadBalancerTarget

@Generated
public fun classicLoadBalancerTarget(loadBalancer: LoadBalancer): ClassicLoadBalancerTarget =
    ClassicLoadBalancerTarget(loadBalancer)
