package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset

@Generated
public
    fun datasetImportJobProperty(initializer: CfnDataset.DatasetImportJobProperty.Builder.() -> Unit
    = {}): CfnDataset.DatasetImportJobProperty =
    CfnDataset.DatasetImportJobProperty.builder().apply(initializer).build()
