package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

@Generated
public fun requestValidatorOptions(initializer: RequestValidatorOptions.Builder.() -> Unit = {}):
    RequestValidatorOptions = RequestValidatorOptions.builder().apply(initializer).build()
