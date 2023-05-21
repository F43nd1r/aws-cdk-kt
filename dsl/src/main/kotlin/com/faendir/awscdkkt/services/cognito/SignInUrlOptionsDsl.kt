package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.SignInUrlOptions

@Generated
public fun signInUrlOptions(initializer: SignInUrlOptions.Builder.() -> Unit = {}): SignInUrlOptions
    = SignInUrlOptions.builder().apply(initializer).build()
