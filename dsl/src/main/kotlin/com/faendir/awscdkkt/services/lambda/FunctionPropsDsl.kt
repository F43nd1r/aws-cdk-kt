@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionProps

public fun functionProps(initializer: FunctionProps.Builder.() -> Unit): FunctionProps =
    FunctionProps.builder().apply(initializer).build()
