package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@Generated
public
    fun dataQualityAppSpecificationProperty(initializer: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder.() -> Unit
    = {}): CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty =
    CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.builder().apply(initializer).build()
