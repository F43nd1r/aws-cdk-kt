package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolSESOptions

@Generated
public fun userPoolSESOptions(initializer: UserPoolSESOptions.Builder.() -> Unit = {}):
    UserPoolSESOptions = UserPoolSESOptions.builder().apply(initializer).build()
