package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTableProps

@Generated
public fun cfnTableProps(initializer: CfnTableProps.Builder.() -> Unit = {}): CfnTableProps =
    CfnTableProps.builder().apply(initializer).build()
