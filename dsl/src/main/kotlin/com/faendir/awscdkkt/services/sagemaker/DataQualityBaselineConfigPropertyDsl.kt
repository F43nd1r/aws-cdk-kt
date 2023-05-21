package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@Generated
public
    fun dataQualityBaselineConfigProperty(initializer: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder.() -> Unit
    = {}): CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty =
    CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.builder().apply(initializer).build()
