@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps
import software.constructs.Construct

public fun Construct.cfnInstanceStorageConfig(
  id: String,
  props: CfnInstanceStorageConfigProps,
  initializer: CfnInstanceStorageConfig.() -> Unit = {},
): CfnInstanceStorageConfig = CfnInstanceStorageConfig(this, id, props).apply(initializer)
