package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun datastoreStorageProperty(initializer: CfnDatastore.DatastoreStorageProperty.Builder.() -> Unit
    = {}): CfnDatastore.DatastoreStorageProperty =
    CfnDatastore.DatastoreStorageProperty.builder().apply(initializer).build()
