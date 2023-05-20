@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

public
    fun connectionDrainingPolicyProperty(initializer: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit):
    CfnLoadBalancer.ConnectionDrainingPolicyProperty =
    CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder().apply(initializer).build()
