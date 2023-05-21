package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public
    fun trafficRoutingConfigProperty(initializer: CfnEndpoint.TrafficRoutingConfigProperty.Builder.() -> Unit
    = {}): CfnEndpoint.TrafficRoutingConfigProperty =
    CfnEndpoint.TrafficRoutingConfigProperty.builder().apply(initializer).build()
