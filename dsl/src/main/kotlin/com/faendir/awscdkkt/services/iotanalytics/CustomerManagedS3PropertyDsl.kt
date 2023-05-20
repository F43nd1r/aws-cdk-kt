@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

public
    fun customerManagedS3Property(initializer: CfnDatastore.CustomerManagedS3Property.Builder.() -> Unit):
    CfnDatastore.CustomerManagedS3Property =
    CfnDatastore.CustomerManagedS3Property.builder().apply(initializer).build()
