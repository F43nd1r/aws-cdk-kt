package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@Generated
public
    fun riskExceptionConfigurationTypeProperty(initializer: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty =
    CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder().apply(initializer).build()
