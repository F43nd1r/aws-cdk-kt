@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretProps

public fun secretProps(initializer: SecretProps.Builder.() -> Unit): SecretProps =
    SecretProps.builder().apply(initializer).build()
