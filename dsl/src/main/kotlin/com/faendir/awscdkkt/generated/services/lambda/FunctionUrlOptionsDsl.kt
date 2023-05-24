package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlOptions

@Generated
public fun buildFunctionUrlOptions(initializer: @AwsCdkDsl FunctionUrlOptions.Builder.() -> Unit):
    FunctionUrlOptions = FunctionUrlOptions.Builder().apply(initializer).build()
