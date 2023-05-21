package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret

@Generated
public
    fun generateSecretStringProperty(initializer: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit
    = {}): CfnSecret.GenerateSecretStringProperty =
    CfnSecret.GenerateSecretStringProperty.builder().apply(initializer).build()
