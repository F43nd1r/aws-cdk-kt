package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public fun httpConfigProperty(initializer: CfnDataSource.HttpConfigProperty.Builder.() -> Unit =
    {}): CfnDataSource.HttpConfigProperty =
    CfnDataSource.HttpConfigProperty.builder().apply(initializer).build()
