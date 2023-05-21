package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset

@Generated
public fun filesLimitProperty(initializer: CfnDataset.FilesLimitProperty.Builder.() -> Unit = {}):
    CfnDataset.FilesLimitProperty =
    CfnDataset.FilesLimitProperty.builder().apply(initializer).build()
