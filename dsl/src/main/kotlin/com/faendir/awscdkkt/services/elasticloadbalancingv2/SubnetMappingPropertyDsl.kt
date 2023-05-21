package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer

@Generated
public
    fun subnetMappingProperty(initializer: CfnLoadBalancer.SubnetMappingProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.SubnetMappingProperty =
    CfnLoadBalancer.SubnetMappingProperty.builder().apply(initializer).build()
