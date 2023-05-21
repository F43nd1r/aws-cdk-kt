package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps

@Generated
public
    fun cfnClusterParameterGroupProps(initializer: CfnClusterParameterGroupProps.Builder.() -> Unit
    = {}): CfnClusterParameterGroupProps =
    CfnClusterParameterGroupProps.builder().apply(initializer).build()
