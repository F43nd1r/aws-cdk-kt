package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

@Generated
public fun buildRequestValidatorOptions(initializer: @AwsCdkDsl
    RequestValidatorOptions.Builder.() -> Unit = {}): RequestValidatorOptions =
    RequestValidatorOptions.Builder().apply(initializer).build()
