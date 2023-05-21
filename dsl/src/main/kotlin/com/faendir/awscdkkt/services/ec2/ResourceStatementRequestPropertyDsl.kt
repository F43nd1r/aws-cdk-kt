package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@Generated
public
    fun resourceStatementRequestProperty(initializer: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty =
    CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.builder().apply(initializer).build()
