package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps

@Generated
public fun clusterParameterGroupProps(initializer: ClusterParameterGroupProps.Builder.() -> Unit =
    {}): ClusterParameterGroupProps =
    ClusterParameterGroupProps.builder().apply(initializer).build()
