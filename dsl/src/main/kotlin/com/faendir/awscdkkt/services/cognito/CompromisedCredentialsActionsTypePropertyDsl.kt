package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@Generated
public
    fun compromisedCredentialsActionsTypeProperty(initializer: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty =
    CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder().apply(initializer).build()
