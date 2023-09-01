package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunctionProps

@Generated
public fun buildSingletonFunctionProps(initializer: @AwsCdkDsl
    SingletonFunctionProps.Builder.() -> Unit = {}): SingletonFunctionProps =
    SingletonFunctionProps.Builder().apply(initializer).build()
