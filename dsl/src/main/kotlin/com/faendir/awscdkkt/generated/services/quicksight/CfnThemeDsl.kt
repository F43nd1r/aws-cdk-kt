package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnTheme.() -> Unit = {},
): CfnTheme = CfnTheme(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTheme(id: String, initializer: @AwsCdkDsl CfnTheme.Builder.() -> Unit =
    {}): CfnTheme = CfnTheme.Builder.create(this, id).apply(initializer).build()
