package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnMLTransform

@Generated
public
    fun transformParametersProperty(initializer: CfnMLTransform.TransformParametersProperty.Builder.() -> Unit
    = {}): CfnMLTransform.TransformParametersProperty =
    CfnMLTransform.TransformParametersProperty.builder().apply(initializer).build()
