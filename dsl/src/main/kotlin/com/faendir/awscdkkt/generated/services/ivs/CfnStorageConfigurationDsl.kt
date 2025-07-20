package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnStorageConfiguration
import software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageConfiguration(
  id: String,
  props: CfnStorageConfigurationProps,
  initializer: @AwsCdkDsl CfnStorageConfiguration.() -> Unit = {},
): CfnStorageConfiguration = CfnStorageConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageConfiguration(id: String, initializer: @AwsCdkDsl CfnStorageConfiguration.Builder.() -> Unit = {}): CfnStorageConfiguration = CfnStorageConfiguration.Builder.create(this, id).apply(initializer).build()
