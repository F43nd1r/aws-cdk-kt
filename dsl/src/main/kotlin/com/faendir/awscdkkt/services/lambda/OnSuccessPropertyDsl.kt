@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

public
    fun onSuccessProperty(initializer: CfnEventInvokeConfig.OnSuccessProperty.Builder.() -> Unit):
    CfnEventInvokeConfig.OnSuccessProperty =
    CfnEventInvokeConfig.OnSuccessProperty.builder().apply(initializer).build()
