package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun datastorePartitionsProperty(initializer: CfnDatastore.DatastorePartitionsProperty.Builder.() -> Unit
    = {}): CfnDatastore.DatastorePartitionsProperty =
    CfnDatastore.DatastorePartitionsProperty.builder().apply(initializer).build()
