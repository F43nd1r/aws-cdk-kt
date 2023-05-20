@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

public
    fun secretRotationApplicationOptions(initializer: SecretRotationApplicationOptions.Builder.() -> Unit):
    SecretRotationApplicationOptions =
    SecretRotationApplicationOptions.builder().apply(initializer).build()
