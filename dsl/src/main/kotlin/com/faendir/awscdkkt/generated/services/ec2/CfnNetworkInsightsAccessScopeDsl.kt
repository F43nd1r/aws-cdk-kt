package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(id: String,
    props: CfnNetworkInsightsAccessScopeProps): CfnNetworkInsightsAccessScope =
    CfnNetworkInsightsAccessScope(this, id, props)

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(
  id: String,
  props: CfnNetworkInsightsAccessScopeProps,
  initializer: @AwsCdkDsl CfnNetworkInsightsAccessScope.() -> Unit,
): CfnNetworkInsightsAccessScope = CfnNetworkInsightsAccessScope(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(id: String): CfnNetworkInsightsAccessScope =
    CfnNetworkInsightsAccessScope(this, id)

@Generated
public fun Construct.cfnNetworkInsightsAccessScope(id: String, initializer: @AwsCdkDsl
    CfnNetworkInsightsAccessScope.() -> Unit): CfnNetworkInsightsAccessScope =
    CfnNetworkInsightsAccessScope(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInsightsAccessScope(id: String, initializer: @AwsCdkDsl
    CfnNetworkInsightsAccessScope.Builder.() -> Unit): CfnNetworkInsightsAccessScope =
    CfnNetworkInsightsAccessScope.Builder.create(this, id).apply(initializer).build()
