package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceStorageConfig(
  id: String,
  props: CfnInstanceStorageConfigProps,
  initializer: CfnInstanceStorageConfig.() -> Unit = {},
): CfnInstanceStorageConfig = CfnInstanceStorageConfig(this, id, props).apply(initializer)
