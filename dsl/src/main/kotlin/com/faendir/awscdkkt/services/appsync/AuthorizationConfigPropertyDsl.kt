package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun authorizationConfigProperty(initializer: CfnDataSource.AuthorizationConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.AuthorizationConfigProperty =
    CfnDataSource.AuthorizationConfigProperty.builder().apply(initializer).build()
