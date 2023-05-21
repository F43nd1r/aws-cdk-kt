package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public
    fun snapStartResponseProperty(initializer: CfnFunction.SnapStartResponseProperty.Builder.() -> Unit
    = {}): CfnFunction.SnapStartResponseProperty =
    CfnFunction.SnapStartResponseProperty.builder().apply(initializer).build()
