package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.amazon.awscdk.services.appconfig.CfnExtensionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExtension(
  id: String,
  props: CfnExtensionProps,
  initializer: CfnExtension.() -> Unit = {},
): CfnExtension = CfnExtension(this, id, props).apply(initializer)
