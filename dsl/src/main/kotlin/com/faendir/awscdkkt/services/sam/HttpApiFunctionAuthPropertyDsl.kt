package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun httpApiFunctionAuthProperty(initializer: CfnFunction.HttpApiFunctionAuthProperty.Builder.() -> Unit
    = {}): CfnFunction.HttpApiFunctionAuthProperty =
    CfnFunction.HttpApiFunctionAuthProperty.builder().apply(initializer).build()
