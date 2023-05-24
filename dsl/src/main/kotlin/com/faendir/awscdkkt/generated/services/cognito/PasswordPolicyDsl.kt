package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.PasswordPolicy

@Generated
public fun buildPasswordPolicy(initializer: @AwsCdkDsl PasswordPolicy.Builder.() -> Unit):
    PasswordPolicy = PasswordPolicy.Builder().apply(initializer).build()
