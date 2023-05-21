package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnStage

@Generated
public
    fun accessLogSettingsProperty(initializer: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit
    = {}): CfnStage.AccessLogSettingsProperty =
    CfnStage.AccessLogSettingsProperty.builder().apply(initializer).build()
