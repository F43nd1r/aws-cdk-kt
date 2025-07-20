package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectoryConfig(
  id: String,
  props: CfnDirectoryConfigProps,
  initializer: @AwsCdkDsl CfnDirectoryConfig.() -> Unit = {},
): CfnDirectoryConfig = CfnDirectoryConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectoryConfig(id: String, initializer: @AwsCdkDsl CfnDirectoryConfig.Builder.() -> Unit = {}): CfnDirectoryConfig = CfnDirectoryConfig.Builder.create(this, id).apply(initializer).build()
