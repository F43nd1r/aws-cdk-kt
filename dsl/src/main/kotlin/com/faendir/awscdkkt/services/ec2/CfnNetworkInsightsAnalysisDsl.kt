@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps
import software.constructs.Construct

public fun Construct.cfnNetworkInsightsAnalysis(
  id: String,
  props: CfnNetworkInsightsAnalysisProps,
  initializer: CfnNetworkInsightsAnalysis.() -> Unit = {},
): CfnNetworkInsightsAnalysis = CfnNetworkInsightsAnalysis(this, id, props).apply(initializer)
