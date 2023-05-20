@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnStage

public
    fun accessLogSettingProperty(initializer: CfnStage.AccessLogSettingProperty.Builder.() -> Unit):
    CfnStage.AccessLogSettingProperty =
    CfnStage.AccessLogSettingProperty.builder().apply(initializer).build()
