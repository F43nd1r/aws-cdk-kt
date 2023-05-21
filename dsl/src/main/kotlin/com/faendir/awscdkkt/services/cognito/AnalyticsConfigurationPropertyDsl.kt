package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

@Generated
public
    fun analyticsConfigurationProperty(initializer: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit
    = {}): CfnUserPoolClient.AnalyticsConfigurationProperty =
    CfnUserPoolClient.AnalyticsConfigurationProperty.builder().apply(initializer).build()
