package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

@Generated
public
    fun destinationConfigurationProperty(initializer: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnRecordingConfiguration.DestinationConfigurationProperty =
    CfnRecordingConfiguration.DestinationConfigurationProperty.builder().apply(initializer).build()
