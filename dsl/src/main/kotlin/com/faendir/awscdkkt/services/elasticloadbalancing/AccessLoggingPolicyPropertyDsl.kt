@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

public
    fun accessLoggingPolicyProperty(initializer: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
    CfnLoadBalancer.AccessLoggingPolicyProperty =
    CfnLoadBalancer.AccessLoggingPolicyProperty.builder().apply(initializer).build()
