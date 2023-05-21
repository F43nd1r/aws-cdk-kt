package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@Generated
public
    fun throughResourcesStatementRequestProperty(initializer: CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty =
    CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.builder().apply(initializer).build()
