package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@Generated
public
    fun triggeringDatasetProperty(initializer: CfnDataset.TriggeringDatasetProperty.Builder.() -> Unit
    = {}): CfnDataset.TriggeringDatasetProperty =
    CfnDataset.TriggeringDatasetProperty.builder().apply(initializer).build()
