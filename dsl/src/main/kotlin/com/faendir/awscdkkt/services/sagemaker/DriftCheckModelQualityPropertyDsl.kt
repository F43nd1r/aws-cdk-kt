package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun driftCheckModelQualityProperty(initializer: CfnModelPackage.DriftCheckModelQualityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.DriftCheckModelQualityProperty =
    CfnModelPackage.DriftCheckModelQualityProperty.builder().apply(initializer).build()
