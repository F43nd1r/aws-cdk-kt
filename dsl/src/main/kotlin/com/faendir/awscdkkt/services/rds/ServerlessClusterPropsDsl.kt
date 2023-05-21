package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterProps

@Generated
public fun serverlessClusterProps(initializer: ServerlessClusterProps.Builder.() -> Unit = {}):
    ServerlessClusterProps = ServerlessClusterProps.builder().apply(initializer).build()
