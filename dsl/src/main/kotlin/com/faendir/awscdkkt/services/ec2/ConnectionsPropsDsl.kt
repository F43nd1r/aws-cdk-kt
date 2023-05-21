package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ConnectionsProps

@Generated
public fun connectionsProps(initializer: ConnectionsProps.Builder.() -> Unit = {}): ConnectionsProps
    = ConnectionsProps.builder().apply(initializer).build()
