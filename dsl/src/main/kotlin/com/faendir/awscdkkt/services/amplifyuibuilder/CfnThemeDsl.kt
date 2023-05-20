@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
