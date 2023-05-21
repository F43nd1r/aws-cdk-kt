package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun mariaDbParametersProperty(initializer: CfnDataSource.MariaDbParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.MariaDbParametersProperty =
    CfnDataSource.MariaDbParametersProperty.builder().apply(initializer).build()
