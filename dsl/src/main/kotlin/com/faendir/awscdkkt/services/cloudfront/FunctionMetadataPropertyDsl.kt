package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnFunction

@Generated
public
    fun functionMetadataProperty(initializer: CfnFunction.FunctionMetadataProperty.Builder.() -> Unit
    = {}): CfnFunction.FunctionMetadataProperty =
    CfnFunction.FunctionMetadataProperty.builder().apply(initializer).build()
