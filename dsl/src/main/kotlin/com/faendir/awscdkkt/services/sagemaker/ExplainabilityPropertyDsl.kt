package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun explainabilityProperty(initializer: CfnModelPackage.ExplainabilityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ExplainabilityProperty =
    CfnModelPackage.ExplainabilityProperty.builder().apply(initializer).build()
