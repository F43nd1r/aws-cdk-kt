package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun rdsHttpEndpointConfigProperty(initializer: CfnDataSource.RdsHttpEndpointConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.RdsHttpEndpointConfigProperty =
    CfnDataSource.RdsHttpEndpointConfigProperty.builder().apply(initializer).build()
