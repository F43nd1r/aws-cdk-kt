package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.SignInPolicy

@Generated
public fun buildSignInPolicy(initializer: @AwsCdkDsl SignInPolicy.Builder.() -> Unit = {}):
    SignInPolicy = SignInPolicy.Builder().apply(initializer).build()
