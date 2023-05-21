package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnTheme
import software.amazon.awscdk.services.quicksight.CfnThemeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTheme(
  id: String,
  props: CfnThemeProps,
  initializer: CfnTheme.() -> Unit = {},
): CfnTheme = CfnTheme(this, id, props).apply(initializer)
