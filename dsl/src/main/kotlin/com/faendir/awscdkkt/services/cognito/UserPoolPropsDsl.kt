@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolProps

public fun userPoolProps(initializer: UserPoolProps.Builder.() -> Unit): UserPoolProps =
    UserPoolProps.builder().apply(initializer).build()
