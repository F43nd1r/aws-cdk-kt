package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisLoadBalancerTargetProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty =
    CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder().apply(initializer).build()
