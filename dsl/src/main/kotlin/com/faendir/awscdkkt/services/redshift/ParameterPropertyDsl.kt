@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

public
    fun parameterProperty(initializer: CfnClusterParameterGroup.ParameterProperty.Builder.() -> Unit):
    CfnClusterParameterGroup.ParameterProperty =
    CfnClusterParameterGroup.ParameterProperty.builder().apply(initializer).build()
