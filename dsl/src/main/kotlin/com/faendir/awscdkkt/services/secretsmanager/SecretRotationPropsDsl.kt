@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps

public fun secretRotationProps(initializer: SecretRotationProps.Builder.() -> Unit):
    SecretRotationProps = SecretRotationProps.builder().apply(initializer).build()
