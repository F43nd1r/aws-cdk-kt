package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun retentionPeriodProperty(initializer: CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit
    = {}): CfnDatastore.RetentionPeriodProperty =
    CfnDatastore.RetentionPeriodProperty.builder().apply(initializer).build()
