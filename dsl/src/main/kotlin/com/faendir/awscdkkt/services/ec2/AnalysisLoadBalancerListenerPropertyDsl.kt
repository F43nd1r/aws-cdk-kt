package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisLoadBalancerListenerProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty =
    CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.builder().apply(initializer).build()
