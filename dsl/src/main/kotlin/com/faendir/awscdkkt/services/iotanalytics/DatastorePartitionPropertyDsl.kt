package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun datastorePartitionProperty(initializer: CfnDatastore.DatastorePartitionProperty.Builder.() -> Unit
    = {}): CfnDatastore.DatastorePartitionProperty =
    CfnDatastore.DatastorePartitionProperty.builder().apply(initializer).build()
