@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

public
    fun throttleSettingsProperty(initializer: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit):
    CfnUsagePlan.ThrottleSettingsProperty =
    CfnUsagePlan.ThrottleSettingsProperty.builder().apply(initializer).build()
