package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

@Generated
public fun onSuccessProperty(initializer: CfnEventInvokeConfig.OnSuccessProperty.Builder.() -> Unit
    = {}): CfnEventInvokeConfig.OnSuccessProperty =
    CfnEventInvokeConfig.OnSuccessProperty.builder().apply(initializer).build()
