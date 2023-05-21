package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnStage

@Generated
public fun canarySettingProperty(initializer: CfnStage.CanarySettingProperty.Builder.() -> Unit =
    {}): CfnStage.CanarySettingProperty =
    CfnStage.CanarySettingProperty.builder().apply(initializer).build()
