package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

@Generated
public
    fun throttleSettingsProperty(initializer: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit
    = {}): CfnUsagePlan.ThrottleSettingsProperty =
    CfnUsagePlan.ThrottleSettingsProperty.builder().apply(initializer).build()
