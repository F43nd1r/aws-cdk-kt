package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@Generated
public
    fun analysisSecurityGroupRuleProperty(initializer: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty =
    CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.builder().apply(initializer).build()
