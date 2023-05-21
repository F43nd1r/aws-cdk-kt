package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisComponentProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisComponentProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisComponentProperty =
    CfnNetworkInsightsAnalysis.AnalysisComponentProperty.builder().apply(initializer).build()
