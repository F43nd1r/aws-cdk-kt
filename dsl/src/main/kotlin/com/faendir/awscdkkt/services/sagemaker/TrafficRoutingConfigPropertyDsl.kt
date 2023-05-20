@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

public
    fun trafficRoutingConfigProperty(initializer: CfnEndpoint.TrafficRoutingConfigProperty.Builder.() -> Unit):
    CfnEndpoint.TrafficRoutingConfigProperty =
    CfnEndpoint.TrafficRoutingConfigProperty.builder().apply(initializer).build()
