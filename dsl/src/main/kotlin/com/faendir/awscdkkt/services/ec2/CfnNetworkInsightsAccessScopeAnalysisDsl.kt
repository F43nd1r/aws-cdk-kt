package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsAccessScopeAnalysis(
  id: String,
  props: CfnNetworkInsightsAccessScopeAnalysisProps,
  initializer: CfnNetworkInsightsAccessScopeAnalysis.() -> Unit = {},
): CfnNetworkInsightsAccessScopeAnalysis = CfnNetworkInsightsAccessScopeAnalysis(this, id,
    props).apply(initializer)
