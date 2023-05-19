@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

public
    fun replicationConfigProperty(initializer: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit):
    CfnEndpoint.ReplicationConfigProperty =
    CfnEndpoint.ReplicationConfigProperty.builder().apply(initializer).build()
