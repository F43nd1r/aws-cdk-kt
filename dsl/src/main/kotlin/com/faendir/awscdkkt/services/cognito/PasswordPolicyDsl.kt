@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.PasswordPolicy

public fun passwordPolicy(initializer: PasswordPolicy.Builder.() -> Unit): PasswordPolicy =
    PasswordPolicy.builder().apply(initializer).build()
