package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

@Generated
public
    fun tokenValidityUnitsProperty(initializer: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit
    = {}): CfnUserPoolClient.TokenValidityUnitsProperty =
    CfnUserPoolClient.TokenValidityUnitsProperty.builder().apply(initializer).build()
