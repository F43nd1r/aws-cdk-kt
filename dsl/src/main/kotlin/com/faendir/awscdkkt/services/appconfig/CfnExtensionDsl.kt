@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.amazon.awscdk.services.appconfig.CfnExtensionProps
import software.constructs.Construct

public fun Construct.cfnExtension(
  id: String,
  props: CfnExtensionProps,
  initializer: CfnExtension.() -> Unit = {},
): CfnExtension = CfnExtension(this, id, props).apply(initializer)
