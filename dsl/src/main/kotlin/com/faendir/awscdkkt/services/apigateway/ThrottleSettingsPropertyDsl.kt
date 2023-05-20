@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

public
    fun throttleSettingsProperty(initializer: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit):
    CfnUsagePlan.ThrottleSettingsProperty =
    CfnUsagePlan.ThrottleSettingsProperty.builder().apply(initializer).build()
