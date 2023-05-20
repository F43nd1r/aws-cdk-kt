@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

public fun httpConfigProperty(initializer: CfnDataSource.HttpConfigProperty.Builder.() -> Unit):
    CfnDataSource.HttpConfigProperty =
    CfnDataSource.HttpConfigProperty.builder().apply(initializer).build()
