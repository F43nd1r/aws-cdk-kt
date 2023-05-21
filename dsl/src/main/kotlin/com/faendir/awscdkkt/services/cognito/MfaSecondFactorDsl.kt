package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.MfaSecondFactor

@Generated
public fun mfaSecondFactor(initializer: MfaSecondFactor.Builder.() -> Unit = {}): MfaSecondFactor =
    MfaSecondFactor.builder().apply(initializer).build()
