package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public fun partitionProperty(initializer: CfnDatastore.PartitionProperty.Builder.() -> Unit = {}):
    CfnDatastore.PartitionProperty =
    CfnDatastore.PartitionProperty.builder().apply(initializer).build()
