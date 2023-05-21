package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps

@Generated
public fun cfnKeyspaceProps(initializer: CfnKeyspaceProps.Builder.() -> Unit = {}): CfnKeyspaceProps
    = CfnKeyspaceProps.builder().apply(initializer).build()
