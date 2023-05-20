@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolProps

public fun userPoolProps(initializer: UserPoolProps.Builder.() -> Unit): UserPoolProps =
    UserPoolProps.builder().apply(initializer).build()
