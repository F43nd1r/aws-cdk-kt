@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

public
    fun tokenValidityUnitsProperty(initializer: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit):
    CfnUserPoolClient.TokenValidityUnitsProperty =
    CfnUserPoolClient.TokenValidityUnitsProperty.builder().apply(initializer).build()
