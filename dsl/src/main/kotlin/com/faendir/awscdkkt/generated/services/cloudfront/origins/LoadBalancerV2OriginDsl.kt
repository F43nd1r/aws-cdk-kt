package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin
import software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2

@Generated
public fun buildLoadBalancerV2Origin(loadBalancer: ILoadBalancerV2, initializer: @AwsCdkDsl LoadBalancerV2Origin.Builder.() -> Unit = {}): LoadBalancerV2Origin = LoadBalancerV2Origin.Builder.create(loadBalancer).apply(initializer).build()
