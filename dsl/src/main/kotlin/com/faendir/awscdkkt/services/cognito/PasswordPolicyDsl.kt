package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.PasswordPolicy

@Generated
public fun passwordPolicy(initializer: PasswordPolicy.Builder.() -> Unit = {}): PasswordPolicy =
    PasswordPolicy.builder().apply(initializer).build()
