@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunctionProps

public fun singletonFunctionProps(initializer: SingletonFunctionProps.Builder.() -> Unit):
    SingletonFunctionProps = SingletonFunctionProps.builder().apply(initializer).build()
