package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes

@Generated
public fun serverlessClusterAttributes(initializer: ServerlessClusterAttributes.Builder.() -> Unit =
    {}): ServerlessClusterAttributes =
    ServerlessClusterAttributes.builder().apply(initializer).build()
