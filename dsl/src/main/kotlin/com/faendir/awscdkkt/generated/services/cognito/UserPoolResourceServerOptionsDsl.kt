package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions

@Generated
public fun buildUserPoolResourceServerOptions(initializer: @AwsCdkDsl
    UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServerOptions =
    UserPoolResourceServerOptions.Builder().apply(initializer).build()
