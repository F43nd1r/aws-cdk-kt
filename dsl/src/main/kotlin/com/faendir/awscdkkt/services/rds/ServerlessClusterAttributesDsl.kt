@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes

public fun serverlessClusterAttributes(initializer: ServerlessClusterAttributes.Builder.() -> Unit):
    ServerlessClusterAttributes = ServerlessClusterAttributes.builder().apply(initializer).build()
