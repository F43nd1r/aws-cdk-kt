package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisRouteTableRouteProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty =
    CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.builder().apply(initializer).build()
