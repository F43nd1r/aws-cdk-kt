package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions

@Generated
public fun attachedSecretOptions(initializer: AttachedSecretOptions.Builder.() -> Unit = {}):
    AttachedSecretOptions = AttachedSecretOptions.builder().apply(initializer).build()
