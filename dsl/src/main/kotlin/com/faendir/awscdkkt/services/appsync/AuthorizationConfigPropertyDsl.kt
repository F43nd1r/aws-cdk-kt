@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

public
    fun authorizationConfigProperty(initializer: CfnDataSource.AuthorizationConfigProperty.Builder.() -> Unit):
    CfnDataSource.AuthorizationConfigProperty =
    CfnDataSource.AuthorizationConfigProperty.builder().apply(initializer).build()
