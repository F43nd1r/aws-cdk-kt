package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps

@Generated
public fun lambdaRuntimeProps(initializer: LambdaRuntimeProps.Builder.() -> Unit = {}):
    LambdaRuntimeProps = LambdaRuntimeProps.builder().apply(initializer).build()
