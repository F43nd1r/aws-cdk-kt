package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlOptions

@Generated
public fun functionUrlOptions(initializer: FunctionUrlOptions.Builder.() -> Unit = {}):
    FunctionUrlOptions = FunctionUrlOptions.builder().apply(initializer).build()
