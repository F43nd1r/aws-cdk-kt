@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

public
    fun tokenValidityUnitsProperty(initializer: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit):
    CfnUserPoolClient.TokenValidityUnitsProperty =
    CfnUserPoolClient.TokenValidityUnitsProperty.builder().apply(initializer).build()
