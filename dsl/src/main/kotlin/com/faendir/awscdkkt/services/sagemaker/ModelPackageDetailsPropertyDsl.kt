package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun modelPackageDetailsProperty(initializer: CfnModelCard.ModelPackageDetailsProperty.Builder.() -> Unit
    = {}): CfnModelCard.ModelPackageDetailsProperty =
    CfnModelCard.ModelPackageDetailsProperty.builder().apply(initializer).build()
