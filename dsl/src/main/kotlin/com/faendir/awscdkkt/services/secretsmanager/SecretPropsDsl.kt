package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretProps

@Generated
public fun secretProps(initializer: SecretProps.Builder.() -> Unit = {}): SecretProps =
    SecretProps.builder().apply(initializer).build()
