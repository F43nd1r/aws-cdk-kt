package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LambdaFunctionProps

@Generated
public fun lambdaFunctionProps(initializer: LambdaFunctionProps.Builder.() -> Unit = {}):
    LambdaFunctionProps = LambdaFunctionProps.builder().apply(initializer).build()
