package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun customerManagedS3Property(initializer: CfnDatastore.CustomerManagedS3Property.Builder.() -> Unit
    = {}): CfnDatastore.CustomerManagedS3Property =
    CfnDatastore.CustomerManagedS3Property.builder().apply(initializer).build()
