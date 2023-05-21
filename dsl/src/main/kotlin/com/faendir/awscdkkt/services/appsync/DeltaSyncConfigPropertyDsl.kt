package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun deltaSyncConfigProperty(initializer: CfnDataSource.DeltaSyncConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.DeltaSyncConfigProperty =
    CfnDataSource.DeltaSyncConfigProperty.builder().apply(initializer).build()
