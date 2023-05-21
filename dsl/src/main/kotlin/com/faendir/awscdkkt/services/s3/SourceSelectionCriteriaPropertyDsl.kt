package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun sourceSelectionCriteriaProperty(initializer: CfnBucket.SourceSelectionCriteriaProperty.Builder.() -> Unit
    = {}): CfnBucket.SourceSelectionCriteriaProperty =
    CfnBucket.SourceSelectionCriteriaProperty.builder().apply(initializer).build()
