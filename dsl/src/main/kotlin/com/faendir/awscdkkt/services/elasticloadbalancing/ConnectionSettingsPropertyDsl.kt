@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

public
    fun connectionSettingsProperty(initializer: CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit):
    CfnLoadBalancer.ConnectionSettingsProperty =
    CfnLoadBalancer.ConnectionSettingsProperty.builder().apply(initializer).build()
