package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

@Generated
public
    fun secretRotationApplicationOptions(initializer: SecretRotationApplicationOptions.Builder.() -> Unit
    = {}): SecretRotationApplicationOptions =
    SecretRotationApplicationOptions.builder().apply(initializer).build()
