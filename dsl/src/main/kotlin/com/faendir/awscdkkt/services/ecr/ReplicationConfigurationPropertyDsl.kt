@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

public
    fun replicationConfigurationProperty(initializer: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit):
    CfnReplicationConfiguration.ReplicationConfigurationProperty =
    CfnReplicationConfiguration.ReplicationConfigurationProperty.builder().apply(initializer).build()
