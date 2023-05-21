package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolProps

@Generated
public fun userPoolProps(initializer: UserPoolProps.Builder.() -> Unit = {}): UserPoolProps =
    UserPoolProps.builder().apply(initializer).build()
