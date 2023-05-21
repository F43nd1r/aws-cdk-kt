package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun modelDataQualityProperty(initializer: CfnModelPackage.ModelDataQualityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ModelDataQualityProperty =
    CfnModelPackage.ModelDataQualityProperty.builder().apply(initializer).build()
