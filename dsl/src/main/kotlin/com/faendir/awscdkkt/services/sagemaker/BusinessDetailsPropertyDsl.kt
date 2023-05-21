package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun businessDetailsProperty(initializer: CfnModelCard.BusinessDetailsProperty.Builder.() -> Unit
    = {}): CfnModelCard.BusinessDetailsProperty =
    CfnModelCard.BusinessDetailsProperty.builder().apply(initializer).build()
