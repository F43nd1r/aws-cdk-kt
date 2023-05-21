package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps

@Generated
public fun secretRotationProps(initializer: SecretRotationProps.Builder.() -> Unit = {}):
    SecretRotationProps = SecretRotationProps.builder().apply(initializer).build()
