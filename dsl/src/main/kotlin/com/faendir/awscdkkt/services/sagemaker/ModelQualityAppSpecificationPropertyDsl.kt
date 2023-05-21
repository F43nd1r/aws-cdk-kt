package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@Generated
public
    fun modelQualityAppSpecificationProperty(initializer: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder.() -> Unit
    = {}): CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty =
    CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.builder().apply(initializer).build()
