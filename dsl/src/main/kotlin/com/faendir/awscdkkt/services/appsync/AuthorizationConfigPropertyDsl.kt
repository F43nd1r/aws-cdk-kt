@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

public
    fun authorizationConfigProperty(initializer: CfnDataSource.AuthorizationConfigProperty.Builder.() -> Unit):
    CfnDataSource.AuthorizationConfigProperty =
    CfnDataSource.AuthorizationConfigProperty.builder().apply(initializer).build()
