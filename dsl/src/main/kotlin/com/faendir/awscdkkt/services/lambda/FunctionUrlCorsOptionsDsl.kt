package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions

@Generated
public fun functionUrlCorsOptions(initializer: FunctionUrlCorsOptions.Builder.() -> Unit = {}):
    FunctionUrlCorsOptions = FunctionUrlCorsOptions.builder().apply(initializer).build()
