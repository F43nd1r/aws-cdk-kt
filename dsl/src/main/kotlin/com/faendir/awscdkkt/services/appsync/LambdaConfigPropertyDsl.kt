package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public fun lambdaConfigProperty(initializer: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit =
    {}): CfnDataSource.LambdaConfigProperty =
    CfnDataSource.LambdaConfigProperty.builder().apply(initializer).build()
