package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnMethod

@Generated
public fun integrationProperty(initializer: CfnMethod.IntegrationProperty.Builder.() -> Unit = {}):
    CfnMethod.IntegrationProperty =
    CfnMethod.IntegrationProperty.builder().apply(initializer).build()
