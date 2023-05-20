@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret

public
    fun generateSecretStringProperty(initializer: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit):
    CfnSecret.GenerateSecretStringProperty =
    CfnSecret.GenerateSecretStringProperty.builder().apply(initializer).build()
