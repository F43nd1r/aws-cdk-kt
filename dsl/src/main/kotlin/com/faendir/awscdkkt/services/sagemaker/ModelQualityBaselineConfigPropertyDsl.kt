package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@Generated
public
    fun modelQualityBaselineConfigProperty(initializer: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder.() -> Unit
    = {}): CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty =
    CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.builder().apply(initializer).build()
