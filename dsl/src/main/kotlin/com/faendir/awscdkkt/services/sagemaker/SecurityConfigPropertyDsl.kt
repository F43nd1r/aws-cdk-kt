package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun securityConfigProperty(initializer: CfnModelCard.SecurityConfigProperty.Builder.() -> Unit =
    {}): CfnModelCard.SecurityConfigProperty =
    CfnModelCard.SecurityConfigProperty.builder().apply(initializer).build()
