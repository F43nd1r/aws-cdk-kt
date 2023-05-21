package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public
    fun clusteringKeyColumnProperty(initializer: CfnTable.ClusteringKeyColumnProperty.Builder.() -> Unit
    = {}): CfnTable.ClusteringKeyColumnProperty =
    CfnTable.ClusteringKeyColumnProperty.builder().apply(initializer).build()
