package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps

@Generated
public
    fun cfnDBClusterParameterGroupProps(initializer: CfnDBClusterParameterGroupProps.Builder.() -> Unit
    = {}): CfnDBClusterParameterGroupProps =
    CfnDBClusterParameterGroupProps.builder().apply(initializer).build()
