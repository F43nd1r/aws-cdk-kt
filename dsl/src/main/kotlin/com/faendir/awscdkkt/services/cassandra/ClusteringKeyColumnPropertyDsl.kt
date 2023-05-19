@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

public
    fun clusteringKeyColumnProperty(initializer: CfnTable.ClusteringKeyColumnProperty.Builder.() -> Unit):
    CfnTable.ClusteringKeyColumnProperty =
    CfnTable.ClusteringKeyColumnProperty.builder().apply(initializer).build()
