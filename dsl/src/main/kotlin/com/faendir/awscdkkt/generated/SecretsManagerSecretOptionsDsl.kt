package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.SecretsManagerSecretOptions

@Generated
public fun buildSecretsManagerSecretOptions(initializer: @AwsCdkDsl
    SecretsManagerSecretOptions.Builder.() -> Unit = {}): SecretsManagerSecretOptions =
    SecretsManagerSecretOptions.Builder().apply(initializer).build()
