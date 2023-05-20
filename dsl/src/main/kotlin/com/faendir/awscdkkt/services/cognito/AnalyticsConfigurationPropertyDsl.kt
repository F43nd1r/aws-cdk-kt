@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

public
    fun analyticsConfigurationProperty(initializer: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit):
    CfnUserPoolClient.AnalyticsConfigurationProperty =
    CfnUserPoolClient.AnalyticsConfigurationProperty.builder().apply(initializer).build()
