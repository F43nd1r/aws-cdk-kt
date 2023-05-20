@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret

public
    fun generateSecretStringProperty(initializer: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit):
    CfnSecret.GenerateSecretStringProperty =
    CfnSecret.GenerateSecretStringProperty.builder().apply(initializer).build()
