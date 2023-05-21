package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public fun modelOverviewProperty(initializer: CfnModelCard.ModelOverviewProperty.Builder.() -> Unit
    = {}): CfnModelCard.ModelOverviewProperty =
    CfnModelCard.ModelOverviewProperty.builder().apply(initializer).build()
