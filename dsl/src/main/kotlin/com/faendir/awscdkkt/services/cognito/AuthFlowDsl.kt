package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AuthFlow

@Generated
public fun authFlow(initializer: AuthFlow.Builder.() -> Unit = {}): AuthFlow =
    AuthFlow.builder().apply(initializer).build()
