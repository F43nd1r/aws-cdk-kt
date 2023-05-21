package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

@Generated
public
    fun replicationConfigProperty(initializer: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit
    = {}): CfnEndpoint.ReplicationConfigProperty =
    CfnEndpoint.ReplicationConfigProperty.builder().apply(initializer).build()
