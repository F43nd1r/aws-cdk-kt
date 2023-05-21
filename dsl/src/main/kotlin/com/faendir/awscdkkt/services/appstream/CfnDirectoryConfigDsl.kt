package com.faendir.awscdkkt.services.appstream

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
  initializer: CfnDirectoryConfig.() -> Unit = {},
): CfnDirectoryConfig = CfnDirectoryConfig(this, id, props).apply(initializer)
