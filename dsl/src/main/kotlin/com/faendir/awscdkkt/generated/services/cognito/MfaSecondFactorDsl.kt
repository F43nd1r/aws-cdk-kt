package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.MfaSecondFactor

@Generated
public fun buildMfaSecondFactor(initializer: @AwsCdkDsl MfaSecondFactor.Builder.() -> Unit = {}):
    MfaSecondFactor = MfaSecondFactor.Builder().apply(initializer).build()
