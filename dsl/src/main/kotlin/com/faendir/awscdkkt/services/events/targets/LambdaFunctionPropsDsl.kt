@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LambdaFunctionProps

public fun lambdaFunctionProps(initializer: LambdaFunctionProps.Builder.() -> Unit):
    LambdaFunctionProps = LambdaFunctionProps.builder().apply(initializer).build()
