@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

public
    fun parameterProperty(initializer: CfnClusterParameterGroup.ParameterProperty.Builder.() -> Unit):
    CfnClusterParameterGroup.ParameterProperty =
    CfnClusterParameterGroup.ParameterProperty.builder().apply(initializer).build()
