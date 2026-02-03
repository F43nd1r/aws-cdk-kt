package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnTieringConfiguration
import software.amazon.awscdk.services.backup.CfnTieringConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTieringConfiguration(
  id: String,
  props: CfnTieringConfigurationProps,
  initializer: @AwsCdkDsl CfnTieringConfiguration.() -> Unit = {},
): CfnTieringConfiguration = CfnTieringConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTieringConfiguration(id: String, initializer: @AwsCdkDsl CfnTieringConfiguration.Builder.() -> Unit = {}): CfnTieringConfiguration = CfnTieringConfiguration.Builder.create(this, id).apply(initializer).build()
