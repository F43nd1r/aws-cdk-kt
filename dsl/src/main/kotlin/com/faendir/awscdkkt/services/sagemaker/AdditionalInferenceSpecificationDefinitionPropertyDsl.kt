package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun additionalInferenceSpecificationDefinitionProperty(initializer: CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.Builder.() -> Unit
    = {}): CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty =
    CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.builder().apply(initializer).build()
