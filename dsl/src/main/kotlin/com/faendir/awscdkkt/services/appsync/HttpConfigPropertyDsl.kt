@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

public fun httpConfigProperty(initializer: CfnDataSource.HttpConfigProperty.Builder.() -> Unit):
    CfnDataSource.HttpConfigProperty =
    CfnDataSource.HttpConfigProperty.builder().apply(initializer).build()
