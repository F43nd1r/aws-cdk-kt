@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.SecretsManagerSecretOptions

public fun secretsManagerSecretOptions(initializer: SecretsManagerSecretOptions.Builder.() -> Unit):
    SecretsManagerSecretOptions = SecretsManagerSecretOptions.builder().apply(initializer).build()
