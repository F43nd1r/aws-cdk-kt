package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.SignInAliases

@Generated
public fun signInAliases(initializer: SignInAliases.Builder.() -> Unit = {}): SignInAliases =
    SignInAliases.builder().apply(initializer).build()
