package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun documentAttributeValueProperty(initializer: CfnDataSource.DocumentAttributeValueProperty.Builder.() -> Unit
    = {}): CfnDataSource.DocumentAttributeValueProperty =
    CfnDataSource.DocumentAttributeValueProperty.builder().apply(initializer).build()
