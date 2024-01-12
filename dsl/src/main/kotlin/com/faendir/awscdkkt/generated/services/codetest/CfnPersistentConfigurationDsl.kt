package com.faendir.awscdkkt.generated.services.codetest

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codetest.CfnPersistentConfiguration
import software.amazon.awscdk.services.codetest.CfnPersistentConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPersistentConfiguration(
  id: String,
  props: CfnPersistentConfigurationProps,
  initializer: @AwsCdkDsl CfnPersistentConfiguration.() -> Unit = {},
): CfnPersistentConfiguration = CfnPersistentConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPersistentConfiguration(id: String, initializer: @AwsCdkDsl
    CfnPersistentConfiguration.Builder.() -> Unit = {}): CfnPersistentConfiguration =
    CfnPersistentConfiguration.Builder.create(this, id).apply(initializer).build()
