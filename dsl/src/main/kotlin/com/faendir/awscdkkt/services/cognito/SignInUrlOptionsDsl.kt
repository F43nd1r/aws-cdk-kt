@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.SignInUrlOptions

public fun signInUrlOptions(initializer: SignInUrlOptions.Builder.() -> Unit): SignInUrlOptions =
    SignInUrlOptions.builder().apply(initializer).build()
