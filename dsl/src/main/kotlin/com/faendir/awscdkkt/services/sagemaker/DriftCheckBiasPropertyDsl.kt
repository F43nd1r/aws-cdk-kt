package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun driftCheckBiasProperty(initializer: CfnModelPackage.DriftCheckBiasProperty.Builder.() -> Unit
    = {}): CfnModelPackage.DriftCheckBiasProperty =
    CfnModelPackage.DriftCheckBiasProperty.builder().apply(initializer).build()
