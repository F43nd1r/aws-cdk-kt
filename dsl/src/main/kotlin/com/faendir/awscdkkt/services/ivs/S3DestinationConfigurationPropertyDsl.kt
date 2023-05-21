package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

@Generated
public
    fun s3DestinationConfigurationProperty(initializer: CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnRecordingConfiguration.S3DestinationConfigurationProperty =
    CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder().apply(initializer).build()
