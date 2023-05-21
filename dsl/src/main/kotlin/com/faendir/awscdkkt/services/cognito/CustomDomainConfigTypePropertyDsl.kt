package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain

@Generated
public
    fun customDomainConfigTypeProperty(initializer: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolDomain.CustomDomainConfigTypeProperty =
    CfnUserPoolDomain.CustomDomainConfigTypeProperty.builder().apply(initializer).build()
