package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

@Generated
public
    fun connectionParametersProperty(initializer: CfnCloudFormationProduct.ConnectionParametersProperty.Builder.() -> Unit
    = {}): CfnCloudFormationProduct.ConnectionParametersProperty =
    CfnCloudFormationProduct.ConnectionParametersProperty.builder().apply(initializer).build()
