package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisPacketHeaderProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty =
    CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.builder().apply(initializer).build()
