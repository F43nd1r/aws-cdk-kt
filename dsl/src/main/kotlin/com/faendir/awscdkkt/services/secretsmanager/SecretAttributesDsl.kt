package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretAttributes

@Generated
public fun secretAttributes(initializer: SecretAttributes.Builder.() -> Unit = {}): SecretAttributes
    = SecretAttributes.builder().apply(initializer).build()
