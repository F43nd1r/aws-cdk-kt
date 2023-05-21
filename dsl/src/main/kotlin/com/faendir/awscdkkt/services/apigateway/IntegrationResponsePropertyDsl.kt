package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnMethod

@Generated
public
    fun integrationResponseProperty(initializer: CfnMethod.IntegrationResponseProperty.Builder.() -> Unit
    = {}): CfnMethod.IntegrationResponseProperty =
    CfnMethod.IntegrationResponseProperty.builder().apply(initializer).build()
