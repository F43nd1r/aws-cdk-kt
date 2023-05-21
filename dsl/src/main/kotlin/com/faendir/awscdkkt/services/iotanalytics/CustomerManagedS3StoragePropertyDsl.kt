package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun customerManagedS3StorageProperty(initializer: CfnDatastore.CustomerManagedS3StorageProperty.Builder.() -> Unit
    = {}): CfnDatastore.CustomerManagedS3StorageProperty =
    CfnDatastore.CustomerManagedS3StorageProperty.builder().apply(initializer).build()
