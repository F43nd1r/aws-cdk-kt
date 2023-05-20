@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
import software.constructs.Construct

public fun Construct.cfnDirectoryConfig(
  id: String,
  props: CfnDirectoryConfigProps,
  initializer: CfnDirectoryConfig.() -> Unit = {},
): CfnDirectoryConfig = CfnDirectoryConfig(this, id, props).apply(initializer)
