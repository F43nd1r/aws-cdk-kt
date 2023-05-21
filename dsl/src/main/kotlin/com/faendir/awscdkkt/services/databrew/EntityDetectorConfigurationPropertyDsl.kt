package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun entityDetectorConfigurationProperty(initializer: CfnJob.EntityDetectorConfigurationProperty.Builder.() -> Unit
    = {}): CfnJob.EntityDetectorConfigurationProperty =
    CfnJob.EntityDetectorConfigurationProperty.builder().apply(initializer).build()
