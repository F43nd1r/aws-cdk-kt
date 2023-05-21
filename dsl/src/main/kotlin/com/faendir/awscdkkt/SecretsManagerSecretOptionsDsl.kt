package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.SecretsManagerSecretOptions

@Generated
public fun secretsManagerSecretOptions(initializer: SecretsManagerSecretOptions.Builder.() -> Unit =
    {}): SecretsManagerSecretOptions =
    SecretsManagerSecretOptions.builder().apply(initializer).build()
