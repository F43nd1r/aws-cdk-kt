@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

public
    fun replicationRegionProperty(initializer: CfnReplicationSet.ReplicationRegionProperty.Builder.() -> Unit):
    CfnReplicationSet.ReplicationRegionProperty =
    CfnReplicationSet.ReplicationRegionProperty.builder().apply(initializer).build()
