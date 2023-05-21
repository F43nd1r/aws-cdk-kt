package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJob

@Generated
public fun connectionsListProperty(initializer: CfnJob.ConnectionsListProperty.Builder.() -> Unit =
    {}): CfnJob.ConnectionsListProperty =
    CfnJob.ConnectionsListProperty.builder().apply(initializer).build()
