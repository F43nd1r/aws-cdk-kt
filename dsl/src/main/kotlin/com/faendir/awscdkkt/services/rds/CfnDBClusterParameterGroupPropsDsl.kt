package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps

@Generated
public
    fun cfnDBClusterParameterGroupProps(initializer: CfnDBClusterParameterGroupProps.Builder.() -> Unit
    = {}): CfnDBClusterParameterGroupProps =
    CfnDBClusterParameterGroupProps.builder().apply(initializer).build()
