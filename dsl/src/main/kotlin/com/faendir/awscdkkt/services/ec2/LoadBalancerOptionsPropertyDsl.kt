@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

public
    fun loadBalancerOptionsProperty(initializer: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder.() -> Unit):
    CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty =
    CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.builder().apply(initializer).build()
