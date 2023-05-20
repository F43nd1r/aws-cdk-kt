@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.ParameterOptions

public fun parameterOptions(initializer: ParameterOptions.Builder.() -> Unit): ParameterOptions =
    ParameterOptions.builder().apply(initializer).build()
