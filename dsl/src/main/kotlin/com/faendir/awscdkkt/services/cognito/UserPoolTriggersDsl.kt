@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolTriggers

public fun userPoolTriggers(initializer: UserPoolTriggers.Builder.() -> Unit): UserPoolTriggers =
    UserPoolTriggers.builder().apply(initializer).build()
