package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsAnalysis(id: String, props: CfnNetworkInsightsAnalysisProps):
    CfnNetworkInsightsAnalysis = CfnNetworkInsightsAnalysis(this, id, props)

@Generated
public fun Construct.cfnNetworkInsightsAnalysis(
  id: String,
  props: CfnNetworkInsightsAnalysisProps,
  initializer: @AwsCdkDsl CfnNetworkInsightsAnalysis.() -> Unit,
): CfnNetworkInsightsAnalysis = CfnNetworkInsightsAnalysis(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInsightsAnalysis(id: String, initializer: @AwsCdkDsl
    CfnNetworkInsightsAnalysis.Builder.() -> Unit): CfnNetworkInsightsAnalysis =
    CfnNetworkInsightsAnalysis.Builder.create(this, id).apply(initializer).build()
