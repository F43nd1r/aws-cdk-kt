@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserVerificationConfig

public fun userVerificationConfig(initializer: UserVerificationConfig.Builder.() -> Unit):
    UserVerificationConfig = UserVerificationConfig.builder().apply(initializer).build()
