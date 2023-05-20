@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnStage

public
    fun accessLogSettingsProperty(initializer: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit):
    CfnStage.AccessLogSettingsProperty =
    CfnStage.AccessLogSettingsProperty.builder().apply(initializer).build()
