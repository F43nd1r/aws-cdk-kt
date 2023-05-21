package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun documentAttributeTargetProperty(initializer: CfnDataSource.DocumentAttributeTargetProperty.Builder.() -> Unit
    = {}): CfnDataSource.DocumentAttributeTargetProperty =
    CfnDataSource.DocumentAttributeTargetProperty.builder().apply(initializer).build()
