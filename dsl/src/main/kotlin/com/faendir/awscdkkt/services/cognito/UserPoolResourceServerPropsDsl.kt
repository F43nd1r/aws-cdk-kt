package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps

@Generated
public fun userPoolResourceServerProps(initializer: UserPoolResourceServerProps.Builder.() -> Unit =
    {}): UserPoolResourceServerProps =
    UserPoolResourceServerProps.builder().apply(initializer).build()
