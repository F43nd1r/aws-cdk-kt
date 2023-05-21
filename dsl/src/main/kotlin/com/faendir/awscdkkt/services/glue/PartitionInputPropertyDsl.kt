package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnPartition

@Generated
public
    fun partitionInputProperty(initializer: CfnPartition.PartitionInputProperty.Builder.() -> Unit =
    {}): CfnPartition.PartitionInputProperty =
    CfnPartition.PartitionInputProperty.builder().apply(initializer).build()
