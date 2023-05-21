package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunctionProps

@Generated
public fun singletonFunctionProps(initializer: SingletonFunctionProps.Builder.() -> Unit = {}):
    SingletonFunctionProps = SingletonFunctionProps.builder().apply(initializer).build()
