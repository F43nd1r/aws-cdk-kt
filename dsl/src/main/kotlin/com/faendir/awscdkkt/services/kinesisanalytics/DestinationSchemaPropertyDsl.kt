package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@Generated
public
    fun destinationSchemaProperty(initializer: CfnApplicationOutputV2.DestinationSchemaProperty.Builder.() -> Unit
    = {}): CfnApplicationOutputV2.DestinationSchemaProperty =
    CfnApplicationOutputV2.DestinationSchemaProperty.builder().apply(initializer).build()
