@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions

public fun attachedSecretOptions(initializer: AttachedSecretOptions.Builder.() -> Unit):
    AttachedSecretOptions = AttachedSecretOptions.builder().apply(initializer).build()
