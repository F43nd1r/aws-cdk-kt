package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun portRangeProperty(initializer: CfnNetworkInsightsAnalysis.PortRangeProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.PortRangeProperty =
    CfnNetworkInsightsAnalysis.PortRangeProperty.builder().apply(initializer).build()
