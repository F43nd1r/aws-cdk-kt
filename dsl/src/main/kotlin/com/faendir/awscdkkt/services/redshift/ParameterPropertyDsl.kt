package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

@Generated
public
    fun parameterProperty(initializer: CfnClusterParameterGroup.ParameterProperty.Builder.() -> Unit
    = {}): CfnClusterParameterGroup.ParameterProperty =
    CfnClusterParameterGroup.ParameterProperty.builder().apply(initializer).build()
