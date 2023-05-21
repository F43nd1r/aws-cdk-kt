package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@Generated
public
    fun notifyEmailTypeProperty(initializer: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty =
    CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder().apply(initializer).build()
