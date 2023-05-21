package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun relationalDatabaseConfigProperty(initializer: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.RelationalDatabaseConfigProperty =
    CfnDataSource.RelationalDatabaseConfigProperty.builder().apply(initializer).build()
