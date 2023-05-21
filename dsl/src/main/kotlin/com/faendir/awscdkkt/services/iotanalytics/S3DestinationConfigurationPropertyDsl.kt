package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@Generated
public
    fun s3DestinationConfigurationProperty(initializer: CfnDataset.S3DestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataset.S3DestinationConfigurationProperty =
    CfnDataset.S3DestinationConfigurationProperty.builder().apply(initializer).build()
