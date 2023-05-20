@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions

public
    fun parameterGroupInstanceBindOptions(initializer: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
    ParameterGroupInstanceBindOptions =
    ParameterGroupInstanceBindOptions.builder().apply(initializer).build()
