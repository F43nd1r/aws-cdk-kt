package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClientProps

@Generated
public fun userPoolClientProps(initializer: UserPoolClientProps.Builder.() -> Unit = {}):
    UserPoolClientProps = UserPoolClientProps.builder().apply(initializer).build()
