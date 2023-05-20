@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

public
    fun accessLoggingPolicyProperty(initializer: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
    CfnLoadBalancer.AccessLoggingPolicyProperty =
    CfnLoadBalancer.AccessLoggingPolicyProperty.builder().apply(initializer).build()
