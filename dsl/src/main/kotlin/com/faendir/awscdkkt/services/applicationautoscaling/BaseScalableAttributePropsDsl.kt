package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps

@Generated
public fun baseScalableAttributeProps(initializer: BaseScalableAttributeProps.Builder.() -> Unit =
    {}): BaseScalableAttributeProps =
    BaseScalableAttributeProps.builder().apply(initializer).build()
