package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@Generated
public
    fun pathStatementRequestProperty(initializer: CfnNetworkInsightsAccessScope.PathStatementRequestProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAccessScope.PathStatementRequestProperty =
    CfnNetworkInsightsAccessScope.PathStatementRequestProperty.builder().apply(initializer).build()
