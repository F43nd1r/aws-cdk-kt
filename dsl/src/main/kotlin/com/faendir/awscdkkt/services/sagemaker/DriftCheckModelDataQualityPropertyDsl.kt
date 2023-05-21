package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun driftCheckModelDataQualityProperty(initializer: CfnModelPackage.DriftCheckModelDataQualityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.DriftCheckModelDataQualityProperty =
    CfnModelPackage.DriftCheckModelDataQualityProperty.builder().apply(initializer).build()
