package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun workDocsConfigurationProperty(initializer: CfnDataSource.WorkDocsConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.WorkDocsConfigurationProperty =
    CfnDataSource.WorkDocsConfigurationProperty.builder().apply(initializer).build()
