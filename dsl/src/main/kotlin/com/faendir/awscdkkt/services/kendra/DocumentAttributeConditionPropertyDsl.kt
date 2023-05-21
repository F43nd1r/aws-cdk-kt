package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun documentAttributeConditionProperty(initializer: CfnDataSource.DocumentAttributeConditionProperty.Builder.() -> Unit
    = {}): CfnDataSource.DocumentAttributeConditionProperty =
    CfnDataSource.DocumentAttributeConditionProperty.builder().apply(initializer).build()
