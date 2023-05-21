package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public
    fun replicationConfigurationProperty(initializer: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnReplicationConfiguration.ReplicationConfigurationProperty =
    CfnReplicationConfiguration.ReplicationConfigurationProperty.builder().apply(initializer).build()
