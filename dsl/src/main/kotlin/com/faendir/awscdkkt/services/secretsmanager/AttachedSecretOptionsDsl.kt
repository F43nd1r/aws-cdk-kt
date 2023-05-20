@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions

public fun attachedSecretOptions(initializer: AttachedSecretOptions.Builder.() -> Unit):
    AttachedSecretOptions = AttachedSecretOptions.builder().apply(initializer).build()
