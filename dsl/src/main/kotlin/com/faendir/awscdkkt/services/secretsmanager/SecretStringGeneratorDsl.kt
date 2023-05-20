@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator

public fun secretStringGenerator(initializer: SecretStringGenerator.Builder.() -> Unit):
    SecretStringGenerator = SecretStringGenerator.builder().apply(initializer).build()
