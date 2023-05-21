package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun modelPackageCreatorProperty(initializer: CfnModelCard.ModelPackageCreatorProperty.Builder.() -> Unit
    = {}): CfnModelCard.ModelPackageCreatorProperty =
    CfnModelCard.ModelPackageCreatorProperty.builder().apply(initializer).build()
