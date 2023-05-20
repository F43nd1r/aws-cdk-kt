@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

public
    fun replicationRegionProperty(initializer: CfnReplicationSet.ReplicationRegionProperty.Builder.() -> Unit):
    CfnReplicationSet.ReplicationRegionProperty =
    CfnReplicationSet.ReplicationRegionProperty.builder().apply(initializer).build()
