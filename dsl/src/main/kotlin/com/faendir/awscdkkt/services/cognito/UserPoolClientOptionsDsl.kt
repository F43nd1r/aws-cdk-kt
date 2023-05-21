package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClientOptions

@Generated
public fun userPoolClientOptions(initializer: UserPoolClientOptions.Builder.() -> Unit = {}):
    UserPoolClientOptions = UserPoolClientOptions.builder().apply(initializer).build()
