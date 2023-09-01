package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AuthFlow

@Generated
public fun buildAuthFlow(initializer: @AwsCdkDsl AuthFlow.Builder.() -> Unit = {}): AuthFlow =
    AuthFlow.Builder().apply(initializer).build()
