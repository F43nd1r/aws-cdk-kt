package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun applicationSnapshotConfigurationProperty(initializer: CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
    CfnApplicationV2.ApplicationSnapshotConfigurationProperty.builder().apply(initializer).build()
