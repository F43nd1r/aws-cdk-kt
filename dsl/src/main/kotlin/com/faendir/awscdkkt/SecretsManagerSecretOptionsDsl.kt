@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.SecretsManagerSecretOptions

public fun secretsManagerSecretOptions(initializer: SecretsManagerSecretOptions.Builder.() -> Unit):
    SecretsManagerSecretOptions = SecretsManagerSecretOptions.builder().apply(initializer).build()
