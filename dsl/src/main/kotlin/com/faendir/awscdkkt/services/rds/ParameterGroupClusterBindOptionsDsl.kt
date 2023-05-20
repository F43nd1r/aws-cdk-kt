@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions

public
    fun parameterGroupClusterBindOptions(initializer: ParameterGroupClusterBindOptions.Builder.() -> Unit):
    ParameterGroupClusterBindOptions =
    ParameterGroupClusterBindOptions.builder().apply(initializer).build()
