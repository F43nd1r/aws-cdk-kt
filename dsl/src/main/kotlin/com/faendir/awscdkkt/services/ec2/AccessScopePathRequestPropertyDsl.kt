package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@Generated
public
    fun accessScopePathRequestProperty(initializer: CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty =
    CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.builder().apply(initializer).build()
