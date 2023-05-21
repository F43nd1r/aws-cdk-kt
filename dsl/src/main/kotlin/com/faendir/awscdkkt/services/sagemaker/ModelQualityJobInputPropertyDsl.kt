package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@Generated
public
    fun modelQualityJobInputProperty(initializer: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder.() -> Unit
    = {}): CfnModelQualityJobDefinition.ModelQualityJobInputProperty =
    CfnModelQualityJobDefinition.ModelQualityJobInputProperty.builder().apply(initializer).build()
