@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
import software.constructs.Construct

public fun Construct.cfnFunctionConfiguration(
  id: String,
  props: CfnFunctionConfigurationProps,
  initializer: CfnFunctionConfiguration.() -> Unit = {},
): CfnFunctionConfiguration = CfnFunctionConfiguration(this, id, props).apply(initializer)
