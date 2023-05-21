package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun driftCheckBaselinesProperty(initializer: CfnModelPackage.DriftCheckBaselinesProperty.Builder.() -> Unit
    = {}): CfnModelPackage.DriftCheckBaselinesProperty =
    CfnModelPackage.DriftCheckBaselinesProperty.builder().apply(initializer).build()
