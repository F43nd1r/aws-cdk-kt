package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsAccessScopeAnalysis(id: String,
    props: CfnNetworkInsightsAccessScopeAnalysisProps): CfnNetworkInsightsAccessScopeAnalysis =
    CfnNetworkInsightsAccessScopeAnalysis(this, id, props)

@Generated
public fun Construct.cfnNetworkInsightsAccessScopeAnalysis(
  id: String,
  props: CfnNetworkInsightsAccessScopeAnalysisProps,
  initializer: @AwsCdkDsl CfnNetworkInsightsAccessScopeAnalysis.() -> Unit,
): CfnNetworkInsightsAccessScopeAnalysis = CfnNetworkInsightsAccessScopeAnalysis(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInsightsAccessScopeAnalysis(id: String, initializer: @AwsCdkDsl
    CfnNetworkInsightsAccessScopeAnalysis.Builder.() -> Unit): CfnNetworkInsightsAccessScopeAnalysis
    = CfnNetworkInsightsAccessScopeAnalysis.Builder.create(this, id).apply(initializer).build()
