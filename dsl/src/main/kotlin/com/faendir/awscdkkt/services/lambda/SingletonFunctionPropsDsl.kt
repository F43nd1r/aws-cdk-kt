@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunctionProps

public fun singletonFunctionProps(initializer: SingletonFunctionProps.Builder.() -> Unit):
    SingletonFunctionProps = SingletonFunctionProps.builder().apply(initializer).build()
