package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

@Generated
public
    fun replicationRegionProperty(initializer: CfnReplicationSet.ReplicationRegionProperty.Builder.() -> Unit
    = {}): CfnReplicationSet.ReplicationRegionProperty =
    CfnReplicationSet.ReplicationRegionProperty.builder().apply(initializer).build()
