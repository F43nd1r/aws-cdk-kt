package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun timestampPartitionProperty(initializer: CfnDatastore.TimestampPartitionProperty.Builder.() -> Unit
    = {}): CfnDatastore.TimestampPartitionProperty =
    CfnDatastore.TimestampPartitionProperty.builder().apply(initializer).build()
