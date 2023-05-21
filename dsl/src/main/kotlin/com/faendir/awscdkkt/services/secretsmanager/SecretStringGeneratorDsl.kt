package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator

@Generated
public fun secretStringGenerator(initializer: SecretStringGenerator.Builder.() -> Unit = {}):
    SecretStringGenerator = SecretStringGenerator.builder().apply(initializer).build()
