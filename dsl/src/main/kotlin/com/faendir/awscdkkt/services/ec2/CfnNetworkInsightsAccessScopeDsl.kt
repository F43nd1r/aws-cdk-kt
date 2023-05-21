package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(id: String,
    initializer: CfnNetworkInsightsAccessScope.() -> Unit = {}): CfnNetworkInsightsAccessScope =
    CfnNetworkInsightsAccessScope(this, id).apply(initializer)

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(
  id: String,
  props: CfnNetworkInsightsAccessScopeProps,
  initializer: CfnNetworkInsightsAccessScope.() -> Unit = {},
): CfnNetworkInsightsAccessScope = CfnNetworkInsightsAccessScope(this, id, props).apply(initializer)
