package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnInstanceStorageConfig.() -> Unit = {},
): CfnInstanceStorageConfig = CfnInstanceStorageConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceStorageConfig(id: String, initializer: @AwsCdkDsl
    CfnInstanceStorageConfig.Builder.() -> Unit = {}): CfnInstanceStorageConfig =
    CfnInstanceStorageConfig.Builder.create(this, id).apply(initializer).build()
