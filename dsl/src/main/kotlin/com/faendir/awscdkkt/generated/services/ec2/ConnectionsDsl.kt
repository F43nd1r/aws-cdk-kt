package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Connections

@Generated
public fun buildConnections(initializer: @AwsCdkDsl Connections.Builder.() -> Unit): Connections =
    Connections.Builder.create().apply(initializer).build()
