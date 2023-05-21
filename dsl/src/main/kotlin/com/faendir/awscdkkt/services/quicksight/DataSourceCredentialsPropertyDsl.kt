package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun dataSourceCredentialsProperty(initializer: CfnDataSource.DataSourceCredentialsProperty.Builder.() -> Unit
    = {}): CfnDataSource.DataSourceCredentialsProperty =
    CfnDataSource.DataSourceCredentialsProperty.builder().apply(initializer).build()
