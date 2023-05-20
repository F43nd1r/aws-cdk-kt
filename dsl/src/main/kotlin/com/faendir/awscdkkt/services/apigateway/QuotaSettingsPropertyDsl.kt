@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

public
    fun quotaSettingsProperty(initializer: CfnUsagePlan.QuotaSettingsProperty.Builder.() -> Unit):
    CfnUsagePlan.QuotaSettingsProperty =
    CfnUsagePlan.QuotaSettingsProperty.builder().apply(initializer).build()
