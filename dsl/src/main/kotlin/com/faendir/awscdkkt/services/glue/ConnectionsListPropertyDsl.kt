@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJob

public fun connectionsListProperty(initializer: CfnJob.ConnectionsListProperty.Builder.() -> Unit):
    CfnJob.ConnectionsListProperty =
    CfnJob.ConnectionsListProperty.builder().apply(initializer).build()
