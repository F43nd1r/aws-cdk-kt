package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun storageClassAnalysisProperty(initializer: CfnBucket.StorageClassAnalysisProperty.Builder.() -> Unit
    = {}): CfnBucket.StorageClassAnalysisProperty =
    CfnBucket.StorageClassAnalysisProperty.builder().apply(initializer).build()
