package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@Generated
public
    fun featureDefinitionProperty(initializer: CfnFeatureGroup.FeatureDefinitionProperty.Builder.() -> Unit
    = {}): CfnFeatureGroup.FeatureDefinitionProperty =
    CfnFeatureGroup.FeatureDefinitionProperty.builder().apply(initializer).build()
