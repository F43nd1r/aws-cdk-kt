@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.amplifyuibuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
import software.constructs.Construct

public fun Construct.cfnTheme(
  id: String,
  props: CfnThemeProps,
  initializer: CfnTheme.() -> Unit = {},
): CfnTheme = CfnTheme(this, id, props).apply(initializer)
