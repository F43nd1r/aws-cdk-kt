package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun buildClusteringKeyColumnProperty(initializer: @AwsCdkDsl
    CfnTable.ClusteringKeyColumnProperty.Builder.() -> Unit = {}):
    CfnTable.ClusteringKeyColumnProperty =
    CfnTable.ClusteringKeyColumnProperty.Builder().apply(initializer).build()
