package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun driftCheckExplainabilityProperty(initializer: CfnModelPackage.DriftCheckExplainabilityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.DriftCheckExplainabilityProperty =
    CfnModelPackage.DriftCheckExplainabilityProperty.builder().apply(initializer).build()
