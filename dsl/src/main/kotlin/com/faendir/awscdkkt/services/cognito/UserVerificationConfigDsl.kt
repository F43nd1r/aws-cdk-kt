package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserVerificationConfig

@Generated
public fun userVerificationConfig(initializer: UserVerificationConfig.Builder.() -> Unit = {}):
    UserVerificationConfig = UserVerificationConfig.builder().apply(initializer).build()
