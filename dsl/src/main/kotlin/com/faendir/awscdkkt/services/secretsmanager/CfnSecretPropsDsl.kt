package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps

@Generated
public fun cfnSecretProps(initializer: CfnSecretProps.Builder.() -> Unit = {}): CfnSecretProps =
    CfnSecretProps.builder().apply(initializer).build()
