package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@Generated
public
    fun versioningConfigurationProperty(initializer: CfnDataset.VersioningConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataset.VersioningConfigurationProperty =
    CfnDataset.VersioningConfigurationProperty.builder().apply(initializer).build()
