@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
import software.constructs.Construct

public fun Construct.cfnNetworkInsightsAccessScopeAnalysis(
  id: String,
  props: CfnNetworkInsightsAccessScopeAnalysisProps,
  initializer: CfnNetworkInsightsAccessScopeAnalysis.() -> Unit = {},
): CfnNetworkInsightsAccessScopeAnalysis = CfnNetworkInsightsAccessScopeAnalysis(this, id,
    props).apply(initializer)
