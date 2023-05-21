package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun jsonTokenTypeConfigurationProperty(initializer: CfnIndex.JsonTokenTypeConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.JsonTokenTypeConfigurationProperty =
    CfnIndex.JsonTokenTypeConfigurationProperty.builder().apply(initializer).build()
