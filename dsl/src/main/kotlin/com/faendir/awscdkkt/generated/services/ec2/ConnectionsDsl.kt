package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.ConnectionsProps

@Generated
public fun connections(): Connections = Connections()

@Generated
public fun connections(props: ConnectionsProps): Connections = Connections(props)

@Generated
public fun buildConnections(initializer: @AwsCdkDsl Connections.Builder.() -> Unit): Connections =
    Connections.Builder.create().apply(initializer).build()
