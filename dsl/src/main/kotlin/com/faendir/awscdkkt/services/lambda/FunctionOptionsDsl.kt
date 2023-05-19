@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionOptions

public fun functionOptions(initializer: FunctionOptions.Builder.() -> Unit): FunctionOptions =
    FunctionOptions.builder().apply(initializer).build()
